package com.example.mmr.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jasper Wu
 * @date 6/4/2019
 **/
@Configuration
@MapperScan("com.example.mmr.mapper")
public class MybatisConfig {
}
