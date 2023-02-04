package com.asustug.unittesting.utils

import java.util.*

class Helper {

    fun isPalindrome(input : String): Boolean{
        var result = true
        var i = 0;
        var j = input.toLowerCase().length - 1;
        while (i < j) {
            if(input[i] != input[j]){
                result = false
                break
            }
            i++
            j--
        }
        println(result)
        return result
    }

}