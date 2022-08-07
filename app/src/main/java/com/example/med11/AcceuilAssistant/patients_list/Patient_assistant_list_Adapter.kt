package com.example.med11.AcceuilAssistant.patients_list

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.med11.AcceuilAssistant.AssistantTabView.Assistant_patient_view
import com.example.med11.AcceuilAssistant.NAME
import com.example.med11.AcceuilAssistant.PICTURE
import com.example.med11.AcceuilAssistant.Patient
import com.example.med11.R

class Patient_assistant_list_Adapter (var PatientList: MutableList<Patient>) : RecyclerView.Adapter<Patient_assistant_list_ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Patient_assistant_list_ViewHolder {

    val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.single_item_patient, parent, false)

    return Patient_assistant_list_ViewHolder(view)
}

    override fun onBindViewHolder(holder: Patient_assistant_list_ViewHolder, position: Int) {
        val name = PatientList[position].patientName


        holder.patientPic.setImageResource(PatientList[position].patientPic)
        holder.patinetName.text = name

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, Assistant_patient_view::class.java)
            intent.apply {
                putExtra(PICTURE, PatientList[position].patientPic)
                putExtra(NAME, name)

            }
            holder.itemView.context.startActivity(intent)
        }

        //holder.btnDelete.setOnClickListener {
            //TODO 13 "Delete a patient from the database and refresh the recyclerView"
        //    AppDataBase.getDatabase(holder.itemView.context).champDao().delete(championsList[position])
        //    championsList.removeAt(position)
       //     notifyDataSetChanged()
       // }
    }

    override fun getItemCount()=PatientList.size
}