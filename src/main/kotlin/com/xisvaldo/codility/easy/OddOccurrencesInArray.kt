package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
class OddOccurrencesInArray {

    @Test
    fun `only one element unpaired`() {
        val array = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        val expected = 7
        val actual = solution(array)
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        var result = 0
        for (number in a) {
            result = number xor result
        }
        return result
    }
}