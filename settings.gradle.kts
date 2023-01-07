pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Noli_Me_Tangere_Reviewer"
include(":androidApp")
include(":shared")
include(":buildsrc")
