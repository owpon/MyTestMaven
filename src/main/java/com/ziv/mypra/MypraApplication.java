package com.ziv.mypra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MypraApplication {

    /**
     * 使用main方法進入
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MypraApplication.class, args);
    }

}
