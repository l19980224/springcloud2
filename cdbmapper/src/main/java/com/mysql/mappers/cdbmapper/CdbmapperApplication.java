package com.mysql.mappers.cdbmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mysql.mappers.cdbmapper.dao")
public class CdbmapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdbmapperApplication.class, args);
    }

}
