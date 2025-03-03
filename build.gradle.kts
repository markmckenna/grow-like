import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm") version "1.2.51" apply false
    id("com.github.johnrengelman.shadow") version "2.0.4" apply false
}

allprojects {
    group = "com.lantopia.grow"
    version = "0.1"

    repositories {
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}