package com.ardhacodes.medicine_app

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMedAdapter(private val listMedicine: ArrayList<Medicine>) : RecyclerView.Adapter<ListMedAdapter.ListViewHolder>(),View.OnClickListener {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_medicine,
            viewGroup,
            false
        )
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val lm = listMedicine[position]
        Glide.with(holder.itemView.context)
            .load(lm.foto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = lm.name
        holder.tvDetail.text = lm.detail
        holder.itemView.setOnClickListener {
            val intent = Intent(this@ListMedAdapter, Detail::class.java)
            intent.putExtra(listMedicine)[position]
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {

    }


    override fun getItemCount(): Int {
        return listMedicine.size
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }


}