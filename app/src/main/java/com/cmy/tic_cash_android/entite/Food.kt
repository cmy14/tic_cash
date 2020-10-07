package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Food(@PrimaryKey(autoGenerate = true)   override var id :Int ,   override var name : String,  override var prix:Double,  override var quantité : Int ): Items(  ) {


}