package com.example.med11.AcceuilPatient

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapterPatient (fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->return Fragment_acceuil_patient()
            1->return Fragment_health_patient()
            2->return Fragment_profil_patient()
            else->return Fragment_acceuil_patient()
        }
    }
}