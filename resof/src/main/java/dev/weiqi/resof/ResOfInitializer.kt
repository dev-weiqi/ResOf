package dev.weiqi.resof

import android.content.Context
import androidx.startup.Initializer

class ResOfInitializer : Initializer<Unit> {

    companion object {
        internal lateinit var appContext: Context
            private set
    }

    override fun create(context: Context) {
        appContext = context
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}