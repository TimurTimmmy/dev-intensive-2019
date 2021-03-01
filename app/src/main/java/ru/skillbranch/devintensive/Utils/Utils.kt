package ru.skillbranch.devintensive.Utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(0)
        return Pair(firstName, lastName)
    }

    fun toInitials(firstName:String?, lastName:String?): String? {
        return "${firstName?.getOrNull(0)} ${lastName?.getOrNull(0)}"
    }
}