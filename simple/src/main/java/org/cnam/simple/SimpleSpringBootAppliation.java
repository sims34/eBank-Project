package org.cnam.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = ("org.cnam.*"))
@EntityScan("org.cnam.simple.model") //trouver les models
@EnableJpaRepositories("org.cnam.simple.repository") //generate code into repository
@EnableAutoConfiguration
@EnableTransactionManagement
public class SimpleSpringBootAppliation {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(SimpleSpringBootAppliation.class, args);
    }
}
