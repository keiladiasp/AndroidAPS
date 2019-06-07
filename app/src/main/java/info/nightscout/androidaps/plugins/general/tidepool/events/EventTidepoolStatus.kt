package info.nightscout.androidaps.plugins.general.tidepool.events

import info.nightscout.androidaps.events.Event
import info.nightscout.androidaps.utils.DateUtil
import java.text.SimpleDateFormat

class EventTidepoolStatus (val status: String) : Event() {
    var date : Long = DateUtil.now()

    internal var timeFormat = SimpleDateFormat("HH:mm:ss")

    fun toPreparedHtml(): StringBuilder {
        val stringBuilder = StringBuilder()
        stringBuilder.append(timeFormat.format(date))
        stringBuilder.append(" <b>")
        stringBuilder.append(status)
        stringBuilder.append("</b> ")
        stringBuilder.append("<br>")
        return stringBuilder
    }

}