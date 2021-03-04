package ru.skillbranch.devintensive.Models

import ru.skillbranch.devintensive.Utils.Utils
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

    constructor(id : String, firstName : String?, lastName : String?) : this(
     id = id,
     firstName = firstName,
     lastName = lastName,
     avatar = null
    )

    constructor(id : String) : this(id, firstName = "Doe", lastName = "Johns $id")

    init {
        println("Its alive!")
    }

    companion object Factory {
        private var lastId = -1
        fun makeUser(fullName:String?):User{
            lastId++
            //val parts:List<String>? = fullName?.split(" ")
            //var firstName = parts?.getOrNull(0)
            //var lastName= parts?.getOrNull(1)
            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName, avatar = null)
        }
    }
}