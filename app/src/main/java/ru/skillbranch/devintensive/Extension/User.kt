package ru.skillbranch.devintensive.Extension

import ru.skillbranch.devintensive.Models.User
import ru.skillbranch.devintensive.Models.UserView
import java.util.*

fun User.toUserView() : UserView {
    val nickName = ""
    val initials = ""
    val status = if (lastVisit == null) "Ниразу не был" else if (isOnline) "online" else ("Последний раз был ${lastVisit!!.humanizeDiff()}")

    return UserView(
            id,
            fullName = "$firstName $lastName",
            nickName = nickName,
            initials = initials,
            avatar = avatar,
            status = status
    )
}

private fun Date.humanizeDiff() : String{
TODO()
}