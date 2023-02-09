package com.example.tns

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(private val context: Context, private val myList: ArrayList<String>):RecyclerView.Adapter<myAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): myAdapter.ViewHolder {
        val myListItem = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false)
        return ViewHolder(myListItem)

    }

    override fun onBindViewHolder(viewHolder: myAdapter.ViewHolder, position: Int) {
        viewHolder.bind(myList[position])

    }

    override fun getItemCount(): Int {
        return myList.count()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(myItem: String) {
            itemView.findViewById<TextView>(R.id.IDtextView).text = myItem
        }

        var sp: Spinner
        var pic: ImageView

        init {
            pic = itemView.findViewById(R.id.IDimageView)
            sp = itemView.findViewById(R.id.IDspinner)
            sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                   when (position){
                       0->{
                           pic.setImageResource(R.drawable.transtema)
                       }
                       1->{
                           pic.setImageResource(R.drawable.ctek)
                       }
                       2->{
                           pic.setImageResource(R.drawable.garo)
                       }
                       3->{
                           pic.setImageResource(R.drawable.chargamp)
                       }
                   }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

            }
        }
    }
}