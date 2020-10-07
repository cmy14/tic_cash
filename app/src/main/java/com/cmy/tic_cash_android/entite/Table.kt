package com.cmy.tic_cash_android.entite

import androidx.room.Ignore
import androidx.room.PrimaryKey

data class Table (@PrimaryKey(autoGenerate = true )  override var id : Int, override var avail : Boolean, override var price : Float,     var nbplace : Int): Places(){}




