package dev.weiqi.resof

import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.content.res.XmlResourceParser
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.Interpolator
import androidx.annotation.*
import androidx.core.content.res.ResourcesCompat
import java.io.InputStream

fun animOf(@AnimRes id: Int): Animation {
    return AnimationUtils.loadAnimation(resOfContext, id) ?: resourceNotFound(id)
}

fun boolOf(@BoolRes id: Int): Boolean {
    return resOfResources.getBoolean(id)
}

fun colorIntOf(@ColorRes id: Int, theme: Resources.Theme? = null): Int {
    return ResourcesCompat.getColor(resOfResources, id, theme)
}

fun colorStateListOf(@ColorRes id: Int, theme: Resources.Theme? = null): ColorStateList {
    return ResourcesCompat.getColorStateList(resOfResources, id, theme)
        ?: resourceNotFound(id)
}

fun dimenOf(@DimenRes id: Int): Float {
    return resOfResources.getDimension(id)
}

fun dimenOffsetOf(@DimenRes id: Int): Int {
    return resOfResources.getDimensionPixelOffset(id)
}

fun dimenSizeOf(@DimenRes id: Int): Int {
    return resOfResources.getDimensionPixelSize(id)
}

fun drawableOf(@DrawableRes id: Int, theme: Resources.Theme? = null): Drawable {
    return ResourcesCompat.getDrawable(resOfResources, id, theme)
        ?: resourceNotFound(id)
}

fun fontOf(@FontRes id: Int): Typeface {
    return ResourcesCompat.getFont(resOfContext, id) ?: resourceNotFound(id)
}

fun fractionOf(@FractionRes id: Int, base: Int, pbase: Int): Float {
    return resOfResources.getFraction(id, base, pbase)
}

fun intArrayOf(@ArrayRes id: Int): IntArray {
    return resOfResources.getIntArray(id)
}

fun integerOf(@IntegerRes id: Int): Int {
    return resOfResources.getInteger(id)
}

fun interpolatorOf(@InterpolatorRes id: Int): Interpolator {
    return AnimationUtils.loadInterpolator(resOfContext, id) ?: resourceNotFound(id)
}

fun layoutOf(@LayoutRes id: Int): XmlResourceParser {
    return resOfResources.getLayout(id)
}

fun pluralsOf(@PluralsRes id: Int, quantity: Int): String {
    return resOfResources.getQuantityString(id, quantity)
}

fun rawOf(@RawRes id: Int): InputStream {
    return resOfResources.openRawResource(id)
}

fun stringArrayOf(@ArrayRes id: Int): Array<out String> {
    return resOfResources.getStringArray(id)
}

fun stringOf(@StringRes id: Int): String {
    return resOfContext.getString(id)
}

fun typedArrayOf(@ArrayRes id: Int): TypedArray {
    return resOfResources.obtainTypedArray(id)
}

fun xmlOf(@XmlRes id: Int): XmlResourceParser {
    return resOfResources.getXml(id)
}