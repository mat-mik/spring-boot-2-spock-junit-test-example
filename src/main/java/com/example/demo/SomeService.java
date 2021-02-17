package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class SomeService implements InitializingBean, DisposableBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("SomeService.postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("SomeService.preDestroy");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SomeService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SomeService.afterPropertiesSet");
    }

    public int foo() throws InterruptedException {
        return ThreadLocalRandom.current().nextInt(10);
    }
}
