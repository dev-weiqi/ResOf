package dev.weiqi.resof

import androidx.annotation.IdRes

@JvmInline
value class ResOfWrapper(@IdRes val id: Int)

inline val @receiver:IdRes Int.resOf get() = ResOfWrapper(this)