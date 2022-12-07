package com.example.viewpagerproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pag = findViewById<ViewPager2>(R.id.viewPager)
        var tabLay = findViewById<TabLayout>(R.id.tabLay)

        val adap = Adapter(supportFragmentManager, lifecycle)

        pag.adapter = adap


        TabLayoutMediator(tabLay, pag){tab, position->
            when(position){
                0->{
                    tab.text = "Home"
                    tab.setIcon(R.drawable.ic_baseline_home_24)
                }
                1->{
                    tab.text = "Person"
                    tab.setIcon(R.drawable.ic_baseline_person_add_alt_24)
                }

                2->{
                    tab.text = "ScanWifi"
                    tab.setIcon(R.drawable.ic_baseline_perm_scan_wifi_24)
                }
            }
        }.attach()

    }
}