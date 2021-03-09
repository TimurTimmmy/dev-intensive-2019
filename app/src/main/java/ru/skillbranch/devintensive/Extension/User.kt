package ru.skillbranch.devintensive.Extension

import ru.skillbranch.devintensive.Models.User
import ru.skillbranch.devintensive.Models.UserView
import ru.skillbranch.devintensive.Utils.Utils
import java.util.*

fun User.toUserView() : UserView {
    val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)
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

