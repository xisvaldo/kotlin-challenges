package com.xisvaldo.codility.medium

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice
 */
class MinAvgTwoSlice {

    @Test
    fun `minimal average slice should be 1`() {
        val expected = 1
        val actual = solution(intArrayOf(4, 2, 2, 5, 1, 5, 8))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        var minIndex = 0
        var minAvg = Double.MAX_VALUE

        for (index in 0 until a.size - 1) {
            val avgFrom2 = (a[index] + a[index + 1]) / 2.0
            if (avgFrom2 < minAvg) {
                minAvg = avgFrom2
                minIndex = index
            }
            if (index < a.size - 2) {
                val avgFrom3 = (a[index] + a[index + 1] + a[index + 2]) / 3.0
                if (avgFrom3 < minAvg) {
                    minAvg = avgFrom3
                    minIndex = index
                }
            }
        }
        return minIndex
    }
}