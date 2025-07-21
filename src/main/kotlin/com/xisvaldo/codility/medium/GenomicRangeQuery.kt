package com.xisvaldo.codility.medium

import org.junit.Test
import kotlin.test.assertTrue

/**
 *
 * @author: xisvaldo
 * @see: https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 */
class GenomicRangeQuery {

    @Test
    fun `fixed test`() {
        val expected = intArrayOf(2, 4, 1)
        val actual = solution(s = "CAGCCTA", p = intArrayOf(2, 5, 0), q = intArrayOf(4, 5, 6))
        assertTrue(expected.contentEquals(actual))
    }

    fun solution(s: String, p: IntArray, q: IntArray): IntArray {
        val size = s.length
        val a = IntArray(size + 1)
        val c = IntArray(size + 1)
        val g = IntArray(size + 1)

        for (index in s.indices) {
            a[index + 1] = a[index]
            c[index + 1] = c[index]
            g[index + 1] = g[index]
            when (s[index]) {
                'A' -> a[index + 1]++
                'C' -> c[index + 1]++
                'G' -> g[index + 1]++
            }
        }

        val result = IntArray(p.size)
        for (index in p.indices) {
            val from = p[index]
            val to = q[index] + 1
            result[index] = when {
                a[to] - a[from] > 0 -> 1
                c[to] - c[from] > 0 -> 2
                g[to] - g[from] > 0 -> 3
                else -> 4
            }
        }
        return result
    }
}