package com.javaspringjpa.huynhnguyenquocbao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EntityScan("com.javaspringjpa.huynhnguyenquocbao")
public class HuynhNguyenQuocBaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuynhNguyenQuocBaoApplication.class, args);
    }


}

