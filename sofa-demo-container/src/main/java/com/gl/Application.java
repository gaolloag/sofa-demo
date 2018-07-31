package com.gl;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gaoliang
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("---------");
        System.out.println(Application.class.getClassLoader().toString());
        System.out.println("---------");
        SpringApplication.run(Application.class, args);
        SofaArkBootstrap.launch(args);
    }
}