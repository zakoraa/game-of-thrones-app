package com.raflis.final_submission_beginner_android_bangkit.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.raflis.final_submission_beginner_android_bangkit.R
import com.raflis.final_submission_beginner_android_bangkit.data.model.EnumHouse
import com.raflis.final_submission_beginner_android_bangkit.data.model.GoTCharacter
import com.raflis.final_submission_beginner_android_bangkit.data.repository.GoTCharacterRepository
import com.raflis.final_submission_beginner_android_bangkit.databinding.ActivityMainBinding
import com.raflis.final_submission_beginner_android_bangkit.view.adapter.ListGoTCharacterAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val goTCharacterList = GoTCharacterRepository.getGoTCharacters()
    private lateinit var filteredCharacterList: ArrayList<GoTCharacter>
    private lateinit var listGoTCharacterAdapter: ListGoTCharacterAdapter
    private var isGrid: Boolean = false

    companion object {
        const val CHARACTER_DATA = "character_data"
        const val LIST = "List"
        const val GRID = "Grid"
        const val ALL = "All"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCharacterList.setHasFixedSize(true)

        filteredCharacterList = ArrayList(goTCharacterList)
        setupSpinners()
        showRecyclerList()

        binding.cvMyProfile.setOnClickListener {
            val intent = Intent(this@MainActivity, MyProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showRecyclerList() {
        listGoTCharacterAdapter = ListGoTCharacterAdapter(
            filteredCharacterList,
            isGrid
        ) { selectedCharacter ->
            val intent = Intent(this@MainActivity, CharacterDetailsActivity::class.java)
            intent.putExtra(CHARACTER_DATA, selectedCharacter)
            startActivity(intent)
        }
        binding.rvCharacterList.adapter = listGoTCharacterAdapter

    }

    private fun setupSpinners() {
        val houseNames = listOf(ALL) + EnumHouse.entries.map { it.fullName }
        val houseAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, houseNames)
        houseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spnChooseHouse.adapter = houseAdapter

        binding.spnChooseHouse.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedHouse = houseNames[position]
                filterCharacterListByHouse(selectedHouse)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        val layoutOptions = arrayOf(LIST, GRID)
        val layoutAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, layoutOptions)
        layoutAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spnChooseLayout.adapter = layoutAdapter

        binding.spnChooseLayout.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isGrid = layoutOptions[position] == GRID
                setRecyclerViewLayoutManager(isGrid)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    private fun filterCharacterListByHouse(selectedHouse: String) {
        filteredCharacterList.clear()

        when (selectedHouse) {
            ALL -> filteredCharacterList.addAll(goTCharacterList)
            else -> filteredCharacterList.addAll(goTCharacterList.filter { EnumHouse.valueOf(it.house.name.toString()).fullName == selectedHouse })
        }

        listGoTCharacterAdapter.notifyDataSetChanged()
    }

    private fun setRecyclerViewLayoutManager(isGrid: Boolean) {
        binding.rvCharacterList.layoutManager = if (isGrid) {
            GridLayoutManager(this, 2)
        } else {
            LinearLayoutManager(this)
        }

        listGoTCharacterAdapter = ListGoTCharacterAdapter(
            filteredCharacterList,
            isGrid
        ) { selectedCharacter ->
            val intent = Intent(this@MainActivity, CharacterDetailsActivity::class.java)
            intent.putExtra(CHARACTER_DATA, selectedCharacter)
            startActivity(intent)
        }
        binding.rvCharacterList.adapter = listGoTCharacterAdapter
    }
}
