package net.linuxutopia.geocaching.models

enum class Rank(val threshold: Int) {
    Newbie(0),
    Apprentice(50),
    Disciple(150),
    Wanderer(400),
    Explorer(1000),
    Adventurer(2000),
    // TODO: Add more names
}