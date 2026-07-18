rootProject.name = "kasechange"

pluginManagement {
    val kotlinVersion: String by settings

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        id("org.jetbrains.kotlin.multiplatform") version kotlinVersion
    }
}
