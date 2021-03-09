package dev.weiqi.resof

import android.content.res.Resources

internal val resOfContext by lazy { ResOfInitializer.appContext }

internal val resOfResources by lazy { resOfContext.resources }

internal fun resourceNotFound(id: Int): Nothing =
    throw Resources.NotFoundException("Unable to find resource ID #0x${id.toString(16)}")