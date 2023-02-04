package com.asustug.unittesting.utils

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome_level() {
        val helper = Helper()
        val result = helper.isPalindrome("level")
        assertEquals(true,result)
    }

    @Test
    fun isPalindrome_Hello() {
        val helper = Helper()
        val result = helper.isPalindrome("hello")
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_empty() {
        val helper = Helper()
        val result = helper.isPalindrome("")
        assertEquals(true,result)
    }
}