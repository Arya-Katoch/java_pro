package com.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BankingSystemApplication — The Entry Point
 * ═══════════════════════════════════════════
 *
 * This is the main class that starts the entire Spring Boot application.
 *
 * @SpringBootApplication is a POWERFUL convenience annotation that combines THREE annotations:
 *
 * 1. @Configuration
 *    - Marks this class as a source of bean definitions
 *    - Allows us to define @Bean methods for custom configurations
 *    - Think of it as: "This class can configure the application"
 *
 * 2. @EnableAutoConfiguration
 *    - Tells Spring Boot to automatically configure beans based on:
 *      a) The dependencies in pom.xml (e.g., added JPA? Auto-configure Hibernate)
 *      b) The properties in application.properties
 *    - This is the "magic" of Spring Boot — it figures out what you need
 *
 * 3. @ComponentScan
 *    - Tells Spring to scan this package (com.banking) and ALL sub-packages
 *      for components (@Controller, @Service, @Repository, @Component)
 *    - This is why our package structure matters!
 *      All packages (controller, service, etc.) are under com.banking
 *
 * Why is this class important?
 * - It's the starting point — like main() in a regular Java program
 * - SpringApplication.run() boots up the embedded Tomcat server,
 *   creates the Spring IoC container, and starts the application
 */
@SpringBootApplication
public class BankingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingSystemApplication.class, args);
    }
}
