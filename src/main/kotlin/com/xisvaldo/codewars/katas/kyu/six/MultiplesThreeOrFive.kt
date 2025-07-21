package com.xisvaldo.codewars.katas.kyu.six

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author: xisvaldo
 * @see: https://www.codewars.com/kata/514b92a657cdc65150000006/train/kotlin
 */
class MultiplesThreeOrFive {

    @Test
    fun testFixed() {
        assertEquals(expected = 23, actual = solution(10))
        assertEquals(expected = 78, actual = solution(20))
        assertEquals(expected = 9168, actual = solution(200))
    }

    private fun solution(number: Int) = (1 until number).filter { (it % 3 == 0) || (it % 5 == 0) }.sum()
}
