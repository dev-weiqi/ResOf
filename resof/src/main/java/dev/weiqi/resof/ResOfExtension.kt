package dev.weiqi.resof

import android.content.res.Resources

fun ResOfWrapper.anim() = animOf(id)
fun ResOfWrapper.bool() = boolOf(id)
fun ResOfWrapper.colorInt(theme: Resources.Theme? = null) = colorIntOf(id, theme)
fun ResOfWrapper.colorStateList(theme: Resources.Theme? = null) = colorStateListOf(id, theme)
fun ResOfWrapper.dimen() = dimenOf(id)
fun ResOfWrapper.dimenOffset() = dimenOffsetOf(id)
fun ResOfWrapper.dimenSize() = dimenSizeOf(id)
fun ResOfWrapper.drawable() = drawableOf(id)
fun ResOfWrapper.font() = fontOf(id)
fun ResOfWrapper.fraction(base: Int, pbase: Int) = fractionOf(id, base, pbase)
fun ResOfWrapper.intArray() = intArrayOf(id)
fun ResOfWrapper.integer() = integerOf(id)
fun ResOfWrapper.interpolator() = interpolatorOf(id)
fun ResOfWrapper.layout() = layoutOf(id)
fun ResOfWrapper.plurals(quantity: Int) = pluralsOf(id, quantity)
fun ResOfWrapper.raw() = rawOf(id)
fun ResOfWrapper.string() = stringOf(id)
fun ResOfWrapper.stringArray() = stringArrayOf(id)
fun ResOfWrapper.typedArray() = typedArrayOf(id)
fun ResOfWrapper.xml() = xmlOf(id)