package com.xisvaldo.codewars.katas.kyu.six

import org.junit.Test
import kotlin.math.sqrt
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://www.codewars.com/kata/550498447451fbbd7600041c/train/kotlin
 */
class AreTheyTheSame {

    @Test
    fun testFixed() {
        val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val a2 = intArrayOf(11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19)

        assertEquals(expected = true, actual = comp(a1, a2))
    }

    private fun comp(a: IntArray?, b: IntArray?) =
        b?.map { sqrt(it.toDouble()).toInt() }?.distinct()?.sorted() == a?.distinct()?.sorted()
}
