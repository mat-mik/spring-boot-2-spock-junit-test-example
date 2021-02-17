package com.example.demo


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class DemoSpec extends Specification {

    @Autowired
    private SomeService someService;

    def "test2_1"() {
        expect:
        1 == 1
    }

    def "test2_2" () throws InterruptedException {
        expect:
        someService.foo() > 0
    }

}