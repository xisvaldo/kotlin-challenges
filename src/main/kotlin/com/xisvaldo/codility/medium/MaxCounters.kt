package com.xisvaldo.codility.medium

import org.junit.Test
import kotlin.test.assertTrue

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 */
class MaxCounters {

    @Test
    fun testFixed() {
        val expected = intArrayOf(3, 2, 2, 4, 2)
        val actual = solution(n = 5, a = intArrayOf(3, 4, 4, 6, 1, 4, 4))
        assertTrue(expected.contentEquals(actual))
    }

    fun solution(n: Int, a: IntArray): IntArray {
        val result = IntArray(n)
        for (number in a) {
            if (number == n + 1) {
                val max = result.max()
                result.fill(max)
            } else
                result[number - 1]++
        }
        return result
    }
}