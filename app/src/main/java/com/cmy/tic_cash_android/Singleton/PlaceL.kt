package com.cmy.tic_cash_android.Singleton

import com.cmy.tic_cash_android.entite.Places


object PlaceL {
    var items= 0
    var  Lists= mutableListOf<Places>()
    // mettre daans une interface
    fun getList():MutableList<Places>{
        return this.Lists
    }
    fun addPlace(place: Places): Boolean{

        return true
    }
    fun removePlace(place: Places):Boolean {
        return true
    }
    fun RemovePlace( num: Int )
    {

    }
    fun updateDb():Boolean{
        return true ;
    }
    fun getDb():Boolean{
        return true ;
    }
}
