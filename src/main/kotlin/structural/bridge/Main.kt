package structural.bridge

import structural.bridge.platforms.*
import structural.bridge.transmissions.AdvancedLive

fun main() {

    startLive(YouTube())
    startLive(TwitchTV())
    startLive(Facebook())
    startLive(DisneyPlus())
}

fun startLive(platform: IPlatform) {
    // System.out.println("...Aguarde!")
    // val live = Live(platform)
    // live.broadcasting()
    // live.result()

    println("Transmissão avançada...aguarde")
    val advancedLive = AdvancedLive(platform)
    advancedLive.broadcasting()
    advancedLive.comments()
    advancedLive.subtitles()
    advancedLive.startingToRecord()
    advancedLive.endRecording()
    advancedLive.result()
}