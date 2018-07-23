plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "fxgl.MainKt"
}

dependencies {
    compile(project(":core"))
    compile(kotlin("stdlib"))
}