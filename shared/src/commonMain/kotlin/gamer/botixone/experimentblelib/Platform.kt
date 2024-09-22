package gamer.botixone.experimentblelib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform