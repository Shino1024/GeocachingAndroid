package net.linuxutopia.geocaching.models

data class Riddle(val ID: String,
                  val cacheID: String,
                  val authorID: String,
                  val content: String,
                  val answer: Coordinates)