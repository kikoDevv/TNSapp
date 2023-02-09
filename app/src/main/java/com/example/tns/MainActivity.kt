package com.example.tns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //frag


    override fun onCreate(savedInstanceState: Bundle?) {
        val myList = ArrayList<String>()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)








        //rec
        val myAdap = myAdapter(this, myList)

        findViewById<Button>(R.id.btAdd).setOnClickListener{
            myList.add("")
            myAdap.notifyDataSetChanged()
            //kompletera
        }



        findViewById<RecyclerView>(R.id.IDrec).adapter = myAdap
        findViewById<RecyclerView>(R.id.IDrec).layoutManager = LinearLayoutManager(this)




    }
}