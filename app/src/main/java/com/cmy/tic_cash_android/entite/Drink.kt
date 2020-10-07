package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Drink(@PrimaryKey   override var id :Int ,     override var name : String,  override var prix:Double,  override var quantité : Int ): Items(  ) {


}