package com.example.med11.AcceuilAssistant

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val PICTURE = "PICTURE"
const val NAME = "NAME"


@Entity(tableName = "patients")
data class Patient
    (
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "patient_pic")
    val patientPic: Int,
    @ColumnInfo(name = "patient_name")
    val patientName: String,

)