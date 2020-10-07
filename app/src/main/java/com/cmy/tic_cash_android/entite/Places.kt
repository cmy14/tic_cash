package com.cmy.tic_cash_android.entite

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
abstract class Places {

   abstract var  id : Int
     //set(value) {id = value  }
       // get() =id
     abstract var avail : Boolean
        //set(value) {avail = value  }
        //get() =avail
     abstract var price : Float

}