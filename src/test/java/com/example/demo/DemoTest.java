package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoTest {

    @Autowired
    private SomeService someService;

    @Test
    void test1_1() {
        assertTrue(1 == 1);
    }

    @Test
    void test2_2() throws InterruptedException {
        assertTrue(someService.foo() > 0);
    }

}
