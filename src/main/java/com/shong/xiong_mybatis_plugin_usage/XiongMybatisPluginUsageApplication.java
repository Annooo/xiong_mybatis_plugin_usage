package com.shong.xiong_mybatis_plugin_usage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.shong.xiong_mybatis_plugin_usage.mapper")
@SpringBootApplication
public class XiongMybatisPluginUsageApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiongMybatisPluginUsageApplication.class, args);
    }

}
