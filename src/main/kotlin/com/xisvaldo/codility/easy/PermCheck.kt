package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/4-counting_elements/perm_check
 */
class PermCheck {

    @Test
    fun `is a permutation array`() {
        val expected = 1
        val actual = solution(intArrayOf(4, 1, 3, 2))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `is not a permutation array`() {
        val expected = 0
        val actual = solution(intArrayOf(4, 1, 3))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        val n = a.size
        val seen = BooleanArray(n + 1)

        for (number in a) {
            if (number < 1 || number > n || seen[number]) return 0
            seen[number] = true
        }
        return 1
    }
}