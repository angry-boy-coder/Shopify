package kz.microhard.microgateway;

import kz.microhard.microgateway.filters.ErrorFilter;
import kz.microhard.microgateway.filters.PostFilter;
import kz.microhard.microgateway.filters.PreFilter;
import kz.microhard.microgateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class MicroGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGatewayApplication.class, args);
        System.out.println("Gateway Service is running...");
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
