package com.example.example

import com.example.example.usecase.determineCurrentRuntime
import kotlin.test.Test
import kotlin.test.assertEquals

class IOSRuntimeTest {
    @Test
    fun shouldDetectOS() {
        val runtime = determineCurrentRuntime()
        assertEquals(runtime.name, "ios")
        assertEquals(runtime.version, "unknown")
    }
}