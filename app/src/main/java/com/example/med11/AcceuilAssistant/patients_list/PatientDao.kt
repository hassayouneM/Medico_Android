package com.example.med11.AcceuilAssistant.patients_list

import androidx.room.*
import com.example.med11.AcceuilAssistant.Patient

@Dao
interface PatientDao {

    @Insert
    fun insert(champ: Patient)

    @Update
    fun update(champ: Patient)

    @Delete
    fun delete(champ: Patient)

    @Query("SELECT * FROM patients")
    fun getAllChamps(): List<Patient>

}