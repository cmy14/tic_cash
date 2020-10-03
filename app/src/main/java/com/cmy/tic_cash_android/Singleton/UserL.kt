package com.cmy.tic_cash_android.Singleton
import com.cmy.tic_cash_android.entite.User

object UserL {

     var items= 0
    var  Lists= mutableListOf<User>()
    init{}


    // mettre dans une interface
    fun getList():MutableList<User>{
        return this.Lists
    }
    fun addUser(user: User): Boolean{

        return true
    }
    fun removeUser(cuct: User):Boolean {
        return true
    }
    fun RemoveUser( num: Int )
    {

    }
    fun updateDb():Boolean{
        return true ;
    }
    fun getDb():Boolean{
        return true ;
    }





}