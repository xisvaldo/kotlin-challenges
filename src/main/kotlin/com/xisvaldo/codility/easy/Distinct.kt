package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/6-sorting/distinct
 */
class Distinct {

    @Test
    fun `distinct count should be 3`() {
        val expected = 3
        val actual = solution(intArrayOf(2, 1, 1, 2, 3, 1))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray) = a.distinct().count()
}