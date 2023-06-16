package com.monzoni.melodim_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MelodimProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MelodimProjectApplication.class, args);
    }

}
