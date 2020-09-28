package com.cmy.tic_cash_android.entite

abstract class Places {

    var  id : Int
     set(value) {id = value  }
        get() =id
    var avail : Boolean
        set(value) {avail = value  }
        get() =avail
    var price : Float
        set(value) {price = value  }
        get() =price

    constructor(id: Int, avail: Boolean, price: Float) {
        this.id = id
        this.avail = avail
        this.price = price
    }
     fun  reserver(): Boolean{
         if (this.avail==true)
         {this.avail= false;}
         else{ return false  }
          return true
     }

}