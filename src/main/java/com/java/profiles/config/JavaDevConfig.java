package com.java.profiles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("prod")
@Configuration
public class JavaDevConfig {
    @PostConstruct
    public void test(){
        System.out.println("Loaded dev env");
    }
}
