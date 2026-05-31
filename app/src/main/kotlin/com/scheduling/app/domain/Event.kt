package com.scheduling.app.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "events")
data class Event(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val dateTime: LocalDateTime,
    val reminderMinutes: Int = 15,
    val isRecurring: Boolean = false,
    val recurringType: String = "" // DAILY, WEEKLY, MONTHLY
)
