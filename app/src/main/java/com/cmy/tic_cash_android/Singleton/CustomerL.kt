package com.cmy.tic_cash_android.Singleton

import com.cmy.tic_cash_android.entite.Customer

object CustomerL {

    var items= 0
    var  Lists= mutableListOf<Customer>()

    init{}
// mettre dans une interface
    fun getList():MutableList<Customer>{
         return this.Lists
    }
    fun addCustomer(cust: Customer): Boolean{

        return true
    }
    fun removeCustomer(cuct: Customer):Boolean {
        return true
    }
    fun RemoveCustomer( num: Int )
    {

    }
    fun updateDb():Boolean{
         return true ;
    }
    fun getDb():Boolean{
         return true ;
    }

}