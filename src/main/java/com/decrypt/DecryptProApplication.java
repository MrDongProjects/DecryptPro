package com.decrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class DecryptProApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecryptProApplication.class, args);
    }

}
