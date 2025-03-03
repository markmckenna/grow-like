plugins {
    application
    id("com.github.johnrengelman.shadow")
    kotlin("jvm")
}

application {
    mainClassName = "fxgl.MainKt"
}

dependencies {
    compile(project(":core"))
    compile(kotlin("stdlib"))
    compile("com.github.almasb:fxgl:0.5.3")
}