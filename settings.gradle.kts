pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Pokedex"
include(":app")
include(":feature:pokemon:data")
include(":feature:pokemon:domain")
include(":feature:pokemon:ui")
include(":feature:pokemondetails:data")
include(":feature:pokemondetails:domain")
include(":feature:pokemondetails:ui")
include(":core:network")
include(":core:common")
include(":core:feature")
