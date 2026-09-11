package com.sue.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sue.music.mapper")
public class MusicPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicPlatformApplication.class, args);
    }

}
