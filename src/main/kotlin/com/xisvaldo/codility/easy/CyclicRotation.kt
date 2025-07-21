package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertTrue

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
class CyclicRotation {

    @Test
    fun `rotating array 3 times`() {
        val expected = intArrayOf(9, 7, 6, 3, 8)
        val actual = solution(a = intArrayOf(3, 8, 9, 7, 6), k = 3)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun `rotating array 1 time`() {
        val expected = intArrayOf(0, 0, 0)
        val actual = solution(a = intArrayOf(0, 0, 0), k = 1)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun `rotating array 4 times`() {
        val expected = intArrayOf(1, 2, 3, 4)
        val actual = solution(a = intArrayOf(1, 2, 3, 4), k = 4)
        assertTrue(expected contentEquals actual)
    }

    fun solution(a: IntArray, k: Int): IntArray {
        val n = a.size
        if (n == 0 || k % n == 0) return a

        val k = k % n
        return a.copyOfRange(fromIndex = n - k, toIndex = n) + a.copyOfRange(fromIndex = 0, toIndex = n - k)
    }
}