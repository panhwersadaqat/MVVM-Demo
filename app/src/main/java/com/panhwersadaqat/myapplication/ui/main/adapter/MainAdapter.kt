package com.panhwersadaqat.myapplication.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.panhwersadaqat.myapplication.R
import com.panhwersadaqat.myapplication.data.model.User




class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var textViewUserName: TextView
        lateinit var textViewUserEmail: TextView
        //lateinit var imageViewAvatar: ImageView
        fun bind(user: User) {
            textViewUserName = itemView.findViewById(com.panhwersadaqat.myapplication.R.id.textViewUserName) as TextView
            textViewUserName.setText(user.name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }

}