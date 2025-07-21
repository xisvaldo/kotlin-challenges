package com.xisvaldo.codility.medium

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer
 */
class MissingInteger {

    @Test
    fun `missing number should be five`() {
        val expected = 5
        val actual = solution(intArrayOf(1, 3, 6, 4, 1, 2))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `missing number should be four`() {
        val expected = 4
        val actual = solution(intArrayOf(1, 2, 3))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `missing number should be one`() {
        val expected = 1
        val actual = solution(intArrayOf(-1, -3))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `missing number should also be one`() {
        val expected = 1
        val actual = solution(intArrayOf(2))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        val seen = BooleanArray(a.size + 1)
        for (number in a) {
            if (number in 1..a.size) seen[number] = true
        }

        for (index in 1..a.size) {
            if (!seen[index]) return index
        }
        return a.size + 1
    }
}