package com.cmy.tic_cash_android.Singleton


import com.cmy.tic_cash_android.entite.Order

object OrderL {
    var items= 0
    var  Lists= mutableListOf<Order>()
    init{}

    // mettre dana une interface
    fun getList():MutableList<Order>{
        return this.Lists
    }
    fun addOrder(order: Order): Boolean{

        return true
    }
    fun removeOrder(order: Order):Boolean {
        return true
    }
    fun RemoveOrder( num: Int )
    {

    }
    fun updateDb():Boolean{
        return true ;
    }
    fun getDb():Boolean{
        return true ;
    }
}