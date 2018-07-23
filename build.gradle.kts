plugins {
    base
    kotlin("jvm") version "1.2.51" apply false
}

allprojects {
    group = "com.lantopia.grow"
    version = "0.1"

    repositories {
        jcenter()
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}