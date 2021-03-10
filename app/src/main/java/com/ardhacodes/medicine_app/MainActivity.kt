package com.ardhacodes.medicine_app

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvMedicine: RecyclerView
    private var list: ArrayList<Medicine> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMedicine = findViewById(R.id.rv_medicine)
        rvMedicine.setHasFixedSize(true)

        list.addAll(MedicineData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvMedicine.layoutManager = LinearLayoutManager(this)
        val listMedAdapter = ListMedAdapter(list)
        rvMedicine.adapter = listMedAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode){
            R.id.action_about -> {
                var move = Intent(this@MainActivity, Aboutdev::class.java)
                startActivities(arrayOf(move))
            }
        }
//        when (selectedMode) {
//            R.id.action_list -> {
//            }
//
//            R.id.action_grid -> {
//            }
//
//            R.id.action_cardview -> {
//            }
//        }
    }

}