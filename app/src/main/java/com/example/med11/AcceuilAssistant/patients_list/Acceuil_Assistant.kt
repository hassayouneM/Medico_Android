package com.example.med11.AcceuilAssistant.patients_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.med11.AcceuilAssistant.Patient
import com.example.med11.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.Exception

class Acceuil_Assistant : AppCompatActivity() {

    lateinit var recylcerPatient: RecyclerView
    lateinit var recylcerPatientAdapter: Patient_assistant_list_Adapter
    lateinit var patientList : MutableList<Patient>

    lateinit var btnAdd : FloatingActionButton

    var counter: Int = 0

    lateinit var dataBase : AppDataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceuil_assistant)

        recylcerPatient = findViewById(R.id.acceuil_assistant_recyclerView)
        btnAdd = findViewById(R.id.btnAdd)

        dataBase = AppDataBase.getDatabase(this)

        btnAdd.setOnClickListener{
            addToDataBase()
        }

        patientList = ArrayList()

        patientList = dataBase.patientDao().getAllChamps() as MutableList<Patient>

        recylcerPatientAdapter = Patient_assistant_list_Adapter(patientList)

        recylcerPatient.adapter = recylcerPatientAdapter

        recylcerPatient.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)

    }

    fun addToDataBase(){
        var patient : Patient? = null

        when(counter){
            0 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 1" )
            1 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 2" )
            2 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 3" )
            3 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 4" )
            4 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 5" )
            5 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 6" )
            6 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 7" )
            7 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 8" )
            8 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 9" )
            9 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 10" )
            10 -> patient = Patient(1, patientPic = R.drawable.ellipse, patientName = "patient 11" )
        }

        counter++

        try {
            dataBase.patientDao().insert(patient!!)
            patientList.add(patient!!)
            recylcerPatientAdapter.PatientList = patientList
            recylcerPatientAdapter.notifyDataSetChanged()
        }catch (ex: Exception){
            Toast.makeText(this, "Could not add another patient !", Toast.LENGTH_SHORT).show()
        }
    }

    //override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      //  menuInflater.inflate(R.menu.menu, menu)
        //return super.onCreateOptionsMenu(menu)
    //}

   // override fun onOptionsItemSelected(item: MenuItem): Boolean {
   //     when (item.itemId){
    //        R.id.mLogout -> {
    //            getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit().clear().apply()
    //            finish()
   //         }
//        return super.onOptionsItemSelected(item)
   // }
}