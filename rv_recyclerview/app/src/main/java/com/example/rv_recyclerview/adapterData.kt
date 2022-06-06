package com.example.rv_recyclerview

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.NavigationMenuItemView
import org.w3c.dom.Text

class adapterData (private val listData: ArrayList<dataLatihan>): RecyclerView.Adapter<adapterData.CardViewHolder>(){
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvnama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvjk: TextView = itemView.findViewById(R.id.tv_jk)
        var btnUpdate: ImageButton = itemView.findViewById(R.id.btn_update)
        var btnDelete: ImageButton = itemView.findViewById(R.id.btn_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.itemkulayout, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val dataNilai = listData[position]
        holder.tvnama.text = dataNilai.nama
        holder.tvjk.text = dataNilai.jenisKelamin
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}