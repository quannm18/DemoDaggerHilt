package com.example.demodaggerhilt.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demodaggerhilt.R
import com.example.demodaggerhilt.data.model.User
import com.example.demodaggerhilt.databinding.ItemLayoutBinding

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.imageViewAvatar.context)
                .load(user.avatar)
                .into(binding.imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}
