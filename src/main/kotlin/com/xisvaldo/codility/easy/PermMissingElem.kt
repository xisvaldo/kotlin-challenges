package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
class PermMissingElem {

    @Test
    fun `missing element is four`() {
        val expected = 4
        val actual = solution(intArrayOf(2, 3, 1, 5))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `missing element is seven`() {
        val expected = 7
        val actual = solution(intArrayOf(1, 4, 5, 3, 8, 2, 6))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        val n = a.size + 1
        val expectedSum = n.toLong() * (n + 1) / 2
        val sum = a.fold(0L) { acc, num -> acc + num }
        return (expectedSum - sum).toInt()
    }
}

