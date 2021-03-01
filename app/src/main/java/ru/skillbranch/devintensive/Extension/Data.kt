package ru.skillbranch.devintensive.Extension

import java.text.SimpleDateFormat
import java.util.*

class Data {

    fun Date.format(pattern:String = "HH:mm:ss dd.MM.yy"):String{
        val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
        return dateFormat.format(this)
    }

    fun Date.add(value:Int, timeUnit:TimeUnits = TimeUnits.SECOND):Date{
        var time = this.time
        time += when (timeUnit){
            TimeUnits.SECOND -> value * SECOND
            TimeUnits.MINUTE -> value * MINUTE
            TimeUnits.HOUR -> value * HOUR
            TimeUnits.DAY -> value * DAY
            else -> throw IllegalStateException("Invalid unit")
        }
        this.time = time
        return this
    }

    companion object {
        const val SECOND = 1000L
        const val MINUTE = SECOND * 60
        const val HOUR = MINUTE * 60
        const val DAY = HOUR * 24
    }
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}