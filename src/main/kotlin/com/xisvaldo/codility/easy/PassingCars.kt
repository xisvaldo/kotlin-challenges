package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars
 */
class PassingCars {

    @Test
    fun `number of passing cars should be five`() {
        val expected = 5
        val actual = solution(intArrayOf(0, 1, 0, 1, 1))
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(a: IntArray): Int {
        var eastCars = 0
        var passingPairs = 0

        for (car in a) {
            if (car == 0) eastCars++
            else {
                passingPairs += eastCars
                if (passingPairs > 1_000_000_000) return -1
            }
        }
        return passingPairs
    }
}