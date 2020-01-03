package com.mdelbel.kata.hello.world

import org.junit.Test
import kotlin.test.assertEquals

class GreeterTest {

    @Test
    fun `greet should say Hello World`() {
        val greater = Greater()

        val greetings = greater.greet()

        assertEquals("Hello World", greetings)
    }

    @Test
    fun `greet to John should say Hello John`() {
        val greater = Greater()

        val greetings = greater.greet(to = "John")

        assertEquals("Hello John", greetings)
    }

}