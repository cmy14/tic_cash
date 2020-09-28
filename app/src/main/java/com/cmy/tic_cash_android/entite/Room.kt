package com.cmy.tic_cash_android.entite

class Room : Places {
var state : Boolean
    set(value) {this.state = value}
     get() =this.state

    constructor(id: Int, avail: Boolean, price: Float ,statr:Boolean ): super(id, avail, price){
        this.state = statr
    }
}