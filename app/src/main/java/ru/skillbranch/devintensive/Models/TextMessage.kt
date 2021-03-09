package ru.skillbranch.devintensive.Models

import ru.skillbranch.devintensive.Extension.humanizeDiff
import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var text:String?
) : BaseMessage(id, from, chat, isIncoming, date) {

    override fun formatMessage(): String {
        return "id:$id ${from?.firstName} ${if (isIncoming) "получил" else "отправл"} сообщение \"$text\" ${date.humanizeDiff()}"
    }
}