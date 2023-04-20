package com.example.a18_autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var arraycountry = arrayOf("India", "Australia", "Canada", "Denmark", "UK", "America")
       var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,arraycountry)

        autoTV.setAdapter(adapter)

    }
}