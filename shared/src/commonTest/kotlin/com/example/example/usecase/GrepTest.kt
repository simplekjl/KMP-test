package com.example.example.usecase

import kotlin.test.Test
import kotlin.test.assertEquals

class GrepTest {

    companion object {
        val sampleData = listOf(
            "123 abc",
            "abc 123",
            "456 cdf",
            "cdf 456",
        )
    }

    @Test
    fun shouldFinMatches() {
        val results = mutableListOf<String>()
        grep(sampleData, "[a-z]+") {
            results.add(it)
        }
        assertEquals(4, results.size)
    }
}