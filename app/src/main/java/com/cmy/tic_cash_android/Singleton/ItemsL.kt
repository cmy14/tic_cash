package com.cmy.tic_cash_android.Singleton

import com.cmy.tic_cash_android.entite.Items

object ItemsL {
    var items= 0
    var  Lists= mutableListOf<Items>()
    init{}

    // mettre dans une interface
    fun getList():MutableList<Items>{
        return this.Lists
    }
    fun addItems(item: Items): Boolean{

        return true
    }
    fun removeItems(item: Items):Boolean {
        return true
    }
    fun RemoveItems( num: Int )
    {

    }
    fun updateDb():Boolean{
        return true ;
    }
    fun getDb():Boolean{
        return true ;
    }
}