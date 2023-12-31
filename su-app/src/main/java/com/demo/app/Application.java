package com.demo.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {"com.demo"})
@EntityScan(basePackages = {"com.demo.**.entity.**"})
public class Application {

    public static void main(String[] args) {
        log.info("system start!");
        SpringApplication.run(Application.class, args);
        log.info("system start over!");
    }
}
