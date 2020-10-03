package com.cmy.tic_cash_android.entite

class Drink: Items {

    var alcool : Boolean
    set(value) {this.alcool=value}
    get() = alcool

    constructor(prix : Double, name : String , quantité : Int): super(prix , name , quantité )
    {
        this.alcool =false
    }
}