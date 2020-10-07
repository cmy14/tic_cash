package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
abstract  class Items {
    abstract  var id :Int
     abstract   var prix :Double
    //get() =  prix
     //set(value) {this.prix=value}

   abstract var name : String
       // get() =  name
        //set(value) {this.name=value}

   abstract  var quantité :Int
      //  get() =  quantité
       // set(value) {this.quantité=value}


}