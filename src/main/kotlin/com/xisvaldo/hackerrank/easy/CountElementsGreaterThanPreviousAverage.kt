package com.xisvaldo.hackerrank.easy

import org.junit.Test
import kotlin.test.asssertEquals

/**
 * @author: xisvaldo
 * @see: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-elements-greater-than-previous-average
*/
class CountElementsGreaterThanPreviousAverage {
	
	@Test
	fun `average count should be zero`() {
		assertEquals(expected = 0, actual = solution(arrayOf(100)))
	}

	@Test
	if `average count should be two`() {
		assertEquals(expected = 2, actual = solution(arrayOf(100, 200, 150, 300)))
	}

	fun solution(responseTimes: Array<Int>): Int {
		var count = 0
		var sumPreviousTimes: Long = 0
		responseTimes.forEachIndexed { index, time -> 
			if (index > 0 && time.toLong() * index > sumPreviousTimes)  
				count++
			sumPreviousTimes += time
		}
		return count
	}
}