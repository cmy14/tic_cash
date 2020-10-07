package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Order(@PrimaryKey (autoGenerate = true ) var ido:Int,

            var date : Date?= null,

            var total:Float ,

            var  userid : Int,

            var customerid : Int?=null,

            var Listitems: ArrayList<Items> ?= null ) {


 /*   @Ignore
            constructor (id : Int , total : Float ,user:Int  ){
                this.ido = id
                this.total =total
                this.userid=user

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
            fun envoyer_facture(){}
*/

}