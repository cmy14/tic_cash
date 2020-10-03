package com.cmy.tic_cash_android.entite

import java.util.*

class Order {

    var ido:Int
    set(value) {this.ido = value}
    get() = this.ido

    var date : Date
        set(value) {this.date = value}
        get() = this.date


    var total:Float
        set(value) {this.total = value }
        get() = this.total

     var  user : User
         set(value) {this.user = value }
         get() = this.user
    var customer  : Customer
        set(value) {this.customer = value }
        get() = this.customer
    var Listitems: ArrayList<Items> ?= null


            constructor (id : Int , total : Float ,user:User  ){
                this.ido = id
                this.total =total
                this.user=user
                // initialiser lisItem
                Listitems=  ArrayList<Items>()
            }
            fun addItem(itema :Items){
                Listitems?.add(itema)
            }
             fun addItems(items :List<Items>){
                items.forEach {  this.addItem(it)}
             }
             fun payer ( ):Double? {
                 var result : Double? = Listitems?.sumByDouble{ it.prix * it.quantité }
                return  result
            }
            fun envoyer_facture(
              
                // create pdf et sens mail
            ){}


}