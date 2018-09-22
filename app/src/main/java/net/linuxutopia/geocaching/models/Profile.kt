package net.linuxutopia.geocaching.models

data class Profile(val ID: String,
                   val nickname: String,
                   val achievements: MutableList<CacheRetrieval>)