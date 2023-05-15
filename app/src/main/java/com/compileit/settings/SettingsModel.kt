package com.compileit.settings

data class SettingsModel(
    var volume: Int,
    val bluetooth: Boolean,
    val darkMode: Boolean,
    val vibration: Boolean
)