package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
data class Room (  @PrimaryKey (autoGenerate = true )  override var id : Int, override var avail : Boolean,  override var price : Float, var state : Boolean): Places(){}