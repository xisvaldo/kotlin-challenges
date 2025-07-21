package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.math.absoluteValue
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium
 */
class TapeEquilibrium {

    @Test
    fun `minimal split part is one`() {
        val expected = 1
        val actual = solution(intArrayOf(3, 1, 2, 4, 3))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        val totalSum = a.sum()
        var minDiff = Int.MAX_VALUE
        var leftSum = 0

        for (index in 0 until a.size - 1) {
            leftSum += a[index]
            val rightSum = totalSum - leftSum
            val diff = (leftSum - rightSum).absoluteValue
            if (diff < minDiff)
                minDiff = diff
        }
        return minDiff
    }
}