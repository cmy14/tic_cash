package com.cmy.tic_cash_android.entite

class Table: Places {

    var nbplace : Int
    set(value) { this.nbplace= value}
    get() = this.nbplace
    constructor (id: Int, avail: Boolean, price: Float, nbplace: Int): super(id, avail, price){
        this.nbplace= nbplace

    }



}