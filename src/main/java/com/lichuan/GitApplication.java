package com.lichuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitApplication.class,args);
        System.out.println("test");
        System.err.println("运行成功");
    }
}
