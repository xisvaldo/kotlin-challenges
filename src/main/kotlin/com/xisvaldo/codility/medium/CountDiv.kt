package com.xisvaldo.codility.medium

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/5-prefix_sums/count_div
 */
class CountDiv {

    @Test
    fun `count number should be three`() {
        val expected = 3
        val actual = solution(a = 6, b = 11, k = 2)
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: Int, b: Int, k: Int): Int {
        if (k == 0) return 0
        val lowerBound = if (a % k == 0) a else a + (k - a % k)
        if (lowerBound > b) return 0
        return (b - lowerBound) / k + 1
    }
}