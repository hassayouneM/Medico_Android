package com.example.med11.AcceuilAssistant.AssistantTabView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.med11.AcceuilPatient.MyAdapterPatient
import com.example.med11.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Assistant_patient_view : AppCompatActivity() {

    var tabTitle = arrayOf("Health","Medication")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assistant_patient_view)

        var pager=findViewById<ViewPager2>(R.id.viewpager2_assistant)
        var tl =findViewById<TabLayout>(R.id.tabLayout_assistant)
        pager.adapter= MyAdapterAssistantView(supportFragmentManager,lifecycle)

        TabLayoutMediator(tl,pager){
                tab,position->
            tab.text=tabTitle[position]
        }.attach()
    }
}