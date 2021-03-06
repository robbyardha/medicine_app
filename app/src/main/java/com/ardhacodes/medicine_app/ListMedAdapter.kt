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

class ListMedAdapter(val listMedicine: ArrayList<Medicine>) : RecyclerView.Adapter<ListMedAdapter.ListViewHolder>(),View.OnClickListener {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_medicine,
            viewGroup,
            false
        )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMedicine.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, foto) = listMedicine[position]

        Glide.with(holder.itemView.context)
            .load(foto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, Detail::class.java)
            moveDetail.putExtra(Detail.EXTRA_PHOTO, foto)
            moveDetail.putExtra(Detail.EXTRA_NAME, name)
            moveDetail.putExtra(Detail.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    override fun onClick(v: View?) {

    }






}