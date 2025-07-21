package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
class BinaryGap {

    @Test
    fun testFixed() {
        assertEquals(expected = 2, actual = solution(9))
        assertEquals(expected = 4, actual = solution(529))
        assertEquals(expected = 0, actual = solution(15))
        assertEquals(expected = 0, actual = solution(32))
        assertEquals(expected = 5, actual = solution(1041))
    }

    fun solution(n: Int) = n.toString(2)
        .trim('0')
        .split('1')
        .maxOfOrNull { it.length } ?: 0
}