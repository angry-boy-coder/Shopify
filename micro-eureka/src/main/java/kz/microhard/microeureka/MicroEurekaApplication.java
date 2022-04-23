package kz.microhard.microeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Enable eureka server
public class MicroEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroEurekaApplication.class, args);
        System.out.println("Eureka Service Started....!!");
    }

}
