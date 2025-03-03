package fxgl

import com.almasb.fxgl.app.GameApplication
import com.almasb.fxgl.settings.GameSettings
import javafx.application.Application

class App : GameApplication() {
    override fun initSettings(settings: GameSettings) {
        settings.run {
            width = 800
            height = 600
            title = "Hello"
            version = "0.1"
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(App::class.java, *args)
}
