package com.cmy.tic_cash_android.entite

class Food : Items{
     var recette :MutableList<String>
    set(value){ recette = value }
    get() = recette

    constructor(prix : Double, name : String , quantité : Int): super(prix , name , quantité ) {
        recette = ArrayList()
}
}