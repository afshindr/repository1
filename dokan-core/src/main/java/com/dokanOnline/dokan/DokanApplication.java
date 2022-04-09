package com.dokanOnline.dokan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dokanOnline.dokan.*")
@EntityScan("com.dokanOnline.dokan.*")
public class DokanApplication {

public static void main(String[] args) {
    SpringApplication.run(DokanApplication.class, args);
}

}
