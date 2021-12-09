package com.example.hwrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cntView()
        preparePhoneListAdapter()

    }

    private fun cntView(){ recyclerView = findViewById(R.id.recycle) }

     private fun preparePhoneListAdapter(){
        val phones:ArrayList<Phone> = ArrayList()
          phones.add(Phone("Nexus 6P", "Huawei", R.drawable.n1))
        phones.add(Phone("Nexus 5X", "LG", R.drawable.n2))
        phones.add(Phone("Nexus 6", "Motorola", R.drawable.n3))
        phones.add(Phone("Nexus 5", "LG", R.drawable.n4))
        phones.add(Phone("Nexus 4", "LG", R.drawable.n5))

        val customAdapter:CustomAdapter = CustomAdapter(phones)
            recyclerView?.adapter = customAdapter

            customAdapter.setOnItemClickListener(object :CustomAdapter.onItemClickListener{
                override fun onItemClick(position: Int) {
                    when(position){
                        0 -> {Toast.makeText(this@MainActivity, "Welcome to Huawei", Toast.LENGTH_SHORT).show()}
                        1 -> {Toast.makeText(this@MainActivity, "Welcome to LG", Toast.LENGTH_SHORT).show()}
                        2 -> {Toast.makeText(this@MainActivity, "Welcome to Motorola", Toast.LENGTH_SHORT).show()}
                        else -> {Toast.makeText(this@MainActivity, "Item No. $position", Toast.LENGTH_SHORT).show()}
                    }

                }

            })
    }



}
