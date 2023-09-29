package com.group.libraryapp

import org.aspectj.lang.annotation.Before
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    companion object{
        @BeforeAll
        @JvmStatic
        fun beforeAll(){
            println("모든 테스트 시작 전")
        }
        @AfterAll
        @JvmStatic
        fun afterAll(){
            println("모든 테스트 시작 후")
        }
    }

    @BeforeEach
    fun before(){
        println("각 테스트 시작 전")
    }

    @AfterEach
    fun after(){
        println("각 테스트 시작 후")
    }

    @Test
    fun test1(){
        println("test1 실행")
    }

    @Test
    fun test2(){
        println("test2 실행")
    }
}