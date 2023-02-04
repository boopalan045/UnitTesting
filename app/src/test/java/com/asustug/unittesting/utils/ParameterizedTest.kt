package com.asustug.unittesting.utils

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterizedTest(private val input: String, private val expected: Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        helper.isPalindrome(input)
        assertEquals(expected, input)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "{index} : {0} is palindrome - {1} is expected}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("madam",true),
                arrayOf("level",true)
            )
        }
    }
}