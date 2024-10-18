package structural.bridge.transmissions

import structural.bridge.platforms.IPlatform

class AdvancedLive(platform: IPlatform) : Live(platform) {

    fun subtitles() {
        println("Legendas ativadas na Transmissão!")
    }

    fun comments() {
        println("Comentários liberados na live")
    }
}