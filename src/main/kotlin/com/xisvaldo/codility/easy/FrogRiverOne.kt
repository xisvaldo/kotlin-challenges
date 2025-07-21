package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
class FrogRiverOne {

    @Test
    fun `minimal leaf landing time is six`() {
        val expected = 6
        val actual = solution(x = 5, a = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4))
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `minimal leaf landing time is -1`() {
        val expected = -1
        val actual = solution(x = 2, a = intArrayOf(2, 2, 2, 2, 2))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(x: Int, a: IntArray): Int {
        val positions = BooleanArray(x + 1)
        var covered = 0

        for (index in a.indices) {
            val element = a[index]
            if (element <= x && !positions[element]) {
                positions[element] = true
                covered++
                if (covered == x) return index
            }
        }
        return -1
    }
}