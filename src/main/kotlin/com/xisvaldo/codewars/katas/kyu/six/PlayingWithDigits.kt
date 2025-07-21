package com.xisvaldo.codewars.katas.kyu.six

import org.junit.Test
import kotlin.math.pow
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://www.codewars.com/kata/5552101f47fc5178b1000050/kotlin
 */
class PlayingWithDigits {

    @Test
    fun testFixed() {
        assertEquals(expected = 1, actual = digPow(89, 1))
        assertEquals(expected = -1, actual = digPow(92, 1))
        assertEquals(expected = 51, actual = digPow(46288, 3))
    }

    private fun digPow(n: Int, p: Int): Int {
        val digits = n.toDigits()
        var sum = 0.0
        digits.forEachIndexed { index, digit ->
            //Since CodeWars wasn't allowing `import kotlin.math.pow` this commented line also works
            //sum += Math.pow(digit.toDouble(), (p.toDouble() + index.toDouble()))
            sum += digit.toDouble().pow(p.toDouble() + index.toDouble())
        }
        return if (sum.toInt() % n == 0) (sum.toInt() / n) else -1
    }

    private fun Int.toDigits() = toString().map { it.toString().toInt() }
}
