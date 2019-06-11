package com.layui;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@MapperScan("com.mysql.mappers.cdbmapper.dao")
public class LayuiApplication {
    private static final Logger logger = LoggerFactory.getLogger(LayuiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LayuiApplication.class,args);
        logger.info("slf4j配置成功！");
    }
}
