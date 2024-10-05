package com.raflis.final_submission_beginner_android_bangkit.view.activity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.raflis.final_submission_beginner_android_bangkit.R
import com.raflis.final_submission_beginner_android_bangkit.data.model.EnumHouse
import com.raflis.final_submission_beginner_android_bangkit.data.model.GoTCharacter
import com.raflis.final_submission_beginner_android_bangkit.databinding.ActivityCharacterDetailsBinding

class CharacterDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterDetailsBinding

    companion object {
        const val CHARACTER_DATA = "character_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_character_details)
        binding = ActivityCharacterDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val character = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<GoTCharacter>(CHARACTER_DATA, GoTCharacter::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<GoTCharacter>(CHARACTER_DATA)
        }

        character?.let { showCharacterDetails(it) }

        binding.cvBack.setOnClickListener {finish()}

        binding.cvShare.setOnClickListener {
            character?.let { shareCharacterDetails(it) }
        }

    }

    private fun showCharacterDetails(character: GoTCharacter) {
        binding.tvCharactersName.text = character.name
        binding.tvCharactersTitle.text = character.title
        binding.tvCharactersActor.text = character.actorName
        binding.tvCharactersEpisodeCount.text =String.format(character.episodeCount.toString())
        binding.tvCharactersCulture.text = character.culture
        binding.tvCharactersDesc.text = character.description
        binding.tvCharactersHouse.text = EnumHouse.valueOf(character.house.name.toString()).fullName
        binding.tvCharactersAge.text = String.format(character.age.toString())

        Glide.with(this)
            .load(character.image)
            .placeholder(R.drawable.profile)
            .error(R.drawable.profile)
            .into(binding.ivCharactersImage)

        Glide.with(this)
            .load(character.house.image)
            .into(binding.ivCharactersHouse)
    }

    @SuppressLint("QueryPermissionsNeeded")
    private fun shareCharacterDetails(character: GoTCharacter) {
        val characterDetails = "A character chosen by God. Who is predicted to defeat the White Walkers army and become the ruler of the 7 kingdoms:\n${character.name}, Title: ${character.title}, Age: ${character.age}, Description: ${character.description}"

        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, characterDetails)
            type = "text/plain"
        }

        if (shareIntent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(shareIntent, "Give a message to my lord:"))
        }
    }
}
