package com.cmy.tic_cash_android.entite

class Customer {
    private  var id : Int
        get() = this.id
    set( value ){this.id = value }
    private var name : String
        get() = this.name
        set( value ){this.name = value }
    var mail : String
        get() = this.mail
        set( value ){this.mail = value }
    constructor( idr : Int ,  namer : String , mailr : String )
    {
        this.id = idr
        this.name= namer
        this.mail=mailr

    }
}