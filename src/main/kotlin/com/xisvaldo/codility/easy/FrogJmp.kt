package com.xisvaldo.codility.easy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp
 */
class FrogJmp {

    @Test
    fun `three jumps to go`() {
        val expected = 3
        val actual = solution(x = 10, y = 85, d = 30)
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `one jump to go`() {
        val expected = 1
        val actual = solution(x = 80, y = 85, d = 30)
        assertEquals(expected = expected, actual = actual)
    }

    fun solution(x: Int, y: Int, d: Int): Int {
        val remainer = if ((y - x) % d == 0) 0 else 1
        return (y - x) / d + remainer
    }
}