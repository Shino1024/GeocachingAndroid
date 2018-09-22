package net.linuxutopia.geocaching.models

import java.time.Duration
import java.util.*

data class CacheRetrieval(val ID: UUID,
                          val cacheID: UUID,
                          val solutionTime: Duration,
                          val retrievalTime: Duration,
                          val solutionDate: Date)