package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity
 data class Customer(  @PrimaryKey(autoGenerate = true)  var id : Int ,   var name : String , var  mail : String ){}