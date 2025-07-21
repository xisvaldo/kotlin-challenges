package com.xisvaldo.codewars.katas.kyu.six

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/kotlin
 */
class CountingDuplicates {

    @Test
    fun `abcde returns zero`() {
        assertEquals(expected = 0, actual = duplicateCount("abcde"))
    }

    @Test
    fun `abcdea returns one`() {
        assertEquals(expected = 1, actual = duplicateCount("abcdea"))
    }

    @Test
    fun `indivisibility returns one`() {
        assertEquals(expected = 1, actual = duplicateCount("indivisibility"))
    }

    @Test
    fun `really long string containing duplicates returns three`() {
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(expected = 3, actual = duplicateCount(text))
    }

    private fun duplicateCount(text: String) = text.lowercase().groupingBy { it }.eachCount().count { it.value > 1 }
}
