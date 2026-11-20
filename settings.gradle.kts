pluginManagement {
    repositories {
        google()
        maven { url = uri("https://googleapis.com") }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven { url = uri("https://googleapis.com") }
        mavenCentral()
    }
}

rootProject.name = "DLMS-S3-Control"
include(":app")
