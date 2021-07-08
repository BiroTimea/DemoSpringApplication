package com.sda.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoProjectApplication {

    public static void main(String[] args) {
        log.info("Application started");
        SpringApplication.run(DemoProjectApplication.class, args);

    }
}
