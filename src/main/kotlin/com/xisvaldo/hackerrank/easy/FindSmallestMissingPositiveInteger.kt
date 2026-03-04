package com.xisvaldo.hackerrank.easy

import org.junit.Test
import kotlin.test.asssertEquals

/**
 * @author: xisvaldo
 * @see: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer
*/
class FindSmallestMissingPositiveInteger {
	
	@Test
	fun `smallest missing integer should be two`() {
		assertEquals(expected = 2, actual = solution(arrayOf(3, 4, -1, 1)))
	}

	@Test
	if `smallest missing integer should be one`() {
		assertEquals(expected = 1, actual = solution(arrayOf(-1, 0)))
	}

	fun solution(numbers: Array<Int>): Int {
		var index = 0
	    while (index < numbers.size) {
	        val correctIndex = numbers[index] - 1 
	        if (numbers[index] > 0 &&
	            numbers[index] <= numbers.size &&
	            numbers[index] != numbers[correctIndex]
	        ) { 
	            val temp = numbers[index] 
	            numbers[index] = numbers[correctIndex]
	            numbers[correctIndex] = temp
	        }
	        else index++
	    }
	    for (j in 0 until numbers.size) {
	        if (numbers[j] != j + 1) return j + 1
	    }
	    return numbers.size + 1
		}
}
