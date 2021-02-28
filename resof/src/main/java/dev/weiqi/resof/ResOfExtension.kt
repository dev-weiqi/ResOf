package dev.weiqi.resof

import android.content.res.Resources

fun Int.asAnim() = animOf(this)
fun Int.asBool() = boolOf(this)
fun Int.asColorInt(theme: Resources.Theme? = null) = colorIntOf(this, theme)
fun Int.asColorStateList(theme: Resources.Theme? = null) = colorStateListOf(this, theme)
fun Int.asDimen() = dimenOf(this)
fun Int.asDimenOffset() = dimenOffsetOf(this)
fun Int.asDimenSize() = dimenSizeOf(this)
fun Int.asDrawable() = drawableOf(this)
fun Int.asFont() = fontOf(this)
fun Int.asFraction(base: Int, pbase: Int) = fractionOf(this, base, pbase)
fun Int.asIntArray() = intArrayOf(this)
fun Int.asInteger() = integerOf(this)
fun Int.asInterpolator() = interpolatorOf(this)
fun Int.asLayout() = layoutOf(this)
fun Int.asPlurals(quantity: Int) = pluralsOf(this, quantity)
fun Int.asRaw() = rawOf(this)
fun Int.asString() = stringOf(this)
fun Int.asStringArray() = stringArrayOf(this)
fun Int.asTypedArray() = typedArrayOf(this)
fun Int.asXml() = xmlOf(this)