package com.raflis.final_submission_beginner_android_bangkit.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raflis.final_submission_beginner_android_bangkit.R
import com.raflis.final_submission_beginner_android_bangkit.data.model.GoTCharacter
import com.raflis.final_submission_beginner_android_bangkit.databinding.CharactersCardBinding
import com.raflis.final_submission_beginner_android_bangkit.databinding.GridCharactersCardBinding

class ListGoTCharacterAdapter(
    private val listCharacter: ArrayList<GoTCharacter>,
    private val isGrid: Boolean,
    private val onClick: (GoTCharacter) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ListViewHolder(var binding: CharactersCardBinding) : RecyclerView.ViewHolder(binding.root)

    inner class GridViewHolder(var binding: GridCharactersCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (isGrid) {
            val binding = GridCharactersCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            GridViewHolder(binding)
        } else {
            val binding = CharactersCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            ListViewHolder(binding)
        }
    }

    override fun getItemCount(): Int = listCharacter.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val character = listCharacter[position]
        when (holder) {
            is ListViewHolder -> bindListViewHolder(holder, character)
            is GridViewHolder -> bindGridViewHolder(holder, character)
        }
    }

    private fun bindListViewHolder(holder: ListViewHolder, character: GoTCharacter) {
        val (name, house, title, _, _, _, _, _, image) = character
        holder.binding.tvCharactersName.text = name
        holder.binding.tvCharactersTitle.text = title
        Glide.with(holder.itemView.context)
            .load(image)
            .placeholder(R.drawable.profile)
            .error(R.drawable.profile)
            .into(holder.binding.ivCharactersImage)
        Glide.with(holder.itemView.context)
            .load(house.image)
            .into(holder.binding.ivCharactersHouse)

        holder.binding.btnSeeDetail.setOnClickListener {
            onClick(character)
        }
    }

    private fun bindGridViewHolder(holder: GridViewHolder, character: GoTCharacter) {
        val (name, house, _, _, _, _, _, _, image) = character
        holder.binding.tvCharactersName.text = name
        Glide.with(holder.itemView.context)
            .load(image)
            .placeholder(R.drawable.profile)
            .error(R.drawable.profile)
            .into(holder.binding.ivCharactersImage)
        Glide.with(holder.itemView.context)
            .load(house.image)
            .into(holder.binding.ivCharactersHouse)

        holder.binding.btnSeeDetail.setOnClickListener {
            onClick(character)
        }
    }
}
