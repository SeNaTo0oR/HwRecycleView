package com.example.hwrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        var phones:ArrayList<Phone> = ArrayList()
          phones.add(Phone("Nexus 6P", "Huawei", R.drawable.n1))
        phones.add(Phone("Nexus 5X", "LG", R.drawable.n2))
        phones.add(Phone("Nexus 6", "Motorola", R.drawable.n3))
        phones.add(Phone("Nexus 5", "LG", R.drawable.n4))
        phones.add(Phone("Nexus 4", "LG", R.drawable.n5))

        var customAdapter:CustomAdapter = CustomAdapter(phones)
            recyclerView?.adapter = customAdapter
    }

}
