package ru.skillbranch.devintensive.Models

import java.util.*

class User(
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {

    companion object Factory {
        private var lastId = -1
        fun makeUser(fullName:String?):User{
            lastId++
            val parts:List<String>? = fullName?.split(" ")
            var firstName = parts?.getOrNull(0)
            var lastName= parts?.getOrNull(1)
            return User(id = "$lastId", firstName = firstName, lastName = lastName, avatar = null)
        }
    }
}