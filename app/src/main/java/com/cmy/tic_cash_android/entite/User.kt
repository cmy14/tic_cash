package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
data class User( @PrimaryKey  val id: Int, var name: String, var role : String) {
  /*  @PrimaryKey
     var name: String
       //  get()= this.name
        //set( value) {this.name= value}
     var id : Int
         //get()= this.id
         //set( value) {this.id= value}

     var poste : String
         //get()= this.poste
//         set( value) {this.poste= value}
@Ignore
    constructor(name: String, id: Int, poste: String) {
        this.name = name
        this.id = id
        this.poste = poste
    }
// list d'items faire un singleton
@Ignore
    fun supprimer( item :Items ) : Boolean{


        return true
    }
    @Ignore
    fun remplir_Stock( item:Items) : Boolean{


        return true
    }
    @Ignore
     fun encasement (): Boolean{
         return  true
    }
    @Ignore
     fun createCusomer (): Boolean{
          return true
     }
*/


}