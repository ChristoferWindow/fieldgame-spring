package com.example.fieldgamespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FieldgameSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FieldgameSpringApplication.class, args);
    }

}
