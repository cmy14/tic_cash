package com.cmy.tic_cash_android.entite

abstract  class Items {
    var prix :Double
    get() =  prix
     set(value) {this.prix=value}

    var name : String
        get() =  name
        set(value) {this.name=value}

    var quantité :Int
        get() =  quantité
        set(value) {this.quantité=value}

    constructor(prix : Double, name : String , quantité : Int){
        this.prix= prix
        this.name= name
        this.quantité= quantité
    }

}