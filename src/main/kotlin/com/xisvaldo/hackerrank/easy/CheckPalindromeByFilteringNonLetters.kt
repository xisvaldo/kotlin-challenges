package com.xisvaldo.hackerrank.easy

import org.junit.Test
import kotlin.test.asssertEquals

/**
 * @author: xisvaldo
 * @see: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-palindrome-filter-non-letters
*/
class CheckPalindromeByFilteringNonLetters {
	
	@Test
	fun `should be a palindrome`() {
		assertEquals(expected = true, actual = solution("A1b2B!a"))
	}

	@Test
	if `should not be a palindrome`() {
		assertEquals(expected = false, actual = solution("A1b2da"))
	}

	fun solution(code: String): Boolean {
		val letters = code.filter { it.isLetter() }.lowercase()
		var left = 0
		var right = letters.length - 1
		while (left < right) {
			if (letters[left] != letters[right]) 
				return false
			left++
			right--
		}
		return true
	}
}