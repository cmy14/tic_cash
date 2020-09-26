package com.cmy.tic_cash_android.entite

class User {
     var name: String
         get()= this.name
        set( value) {this.name= value}
     var id : Int
         get()= this.id
         set( value) {this.id= value}

     var poste : String
         get()= this.poste
         set( value) {this.poste= value}

    constructor(name: String, id: Int, poste: String) {
        this.name = name
        this.id = id
        this.poste = poste
    }
// list d'items faire un singleton
    fun supprimer( item :Items ) : Boolean{


        return true
    }

    fun remplir_Stock( item:Items) : Boolean{


        return true
    }
     fun encasement (): Boolean{
         return  true
    }
     fun createCusomer (): Boolean{
          return true
     }


}