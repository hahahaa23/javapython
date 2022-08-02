package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//스프링 객체담는 통
public class Config1 {

    @Bean
    public A a(){
        return new A();
    }




}
