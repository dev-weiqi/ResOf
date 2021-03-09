package dev.weiqi.resof

data class ResOfWrapper(val id: Int)

val Int.resOf get() = ResOfWrapper(this)