package com.udacity.shoestore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.models.Shoe

class ShoesAdapter(private val shoes : List<Shoe>) : RecyclerView.Adapter<ShoeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
      val row : View = LayoutInflater.from(parent.context).inflate(R.layout.shoe_list_layout, parent, false)
        return ShoeViewHolder(row)
    }

    override fun getItemCount(): Int {
        return shoes.size
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.bind(shoes[position])
    }

}

class ShoeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val name : TextView = itemView.findViewById(R.id.shoeName)
    private val size : TextView = itemView.findViewById(R.id.shoeSize)
    private val company : TextView = itemView.findViewById(R.id.shoeCompany)
    private val description : TextView = itemView.findViewById(R.id.shoeDesc)

    fun bind(shoe: Shoe) {
        name.text = shoe.name
        size.text = shoe.size.toString()
        company.text = shoe.company
        description.text = shoe.description
    }
}
