package com.example.med11.AcceuilAssistant.patients_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.med11.R

class Patient_assistant_list_ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val patientPic : ImageView = itemView.findViewById<ImageView>(R.id.patient_pic_acceuil_patient)
    val patinetName : TextView = itemView.findViewById<TextView>(R.id.patient_name_acceuil_patient)
//    val btnDelete : ImageView = itemView.findViewById(R.id.btnDelete)

}