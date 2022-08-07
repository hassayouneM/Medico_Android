package com.example.med11.AcceuilAssistant.patients_list

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.med11.AcceuilAssistant.Patient

@Database(entities = [Patient::class], version = 1)
abstract class AppDataBase : RoomDatabase(){

    abstract fun patientDao(): PatientDao

    companion object {
        @Volatile
        private var instance: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            if (instance == null) {
                synchronized(this) {
                    instance =
                        Room.databaseBuilder(context, AppDataBase::class.java, "patients")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return instance!!
        }
    }
}