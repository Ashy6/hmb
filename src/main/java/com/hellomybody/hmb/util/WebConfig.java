package com.hellomybody.hmb.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//进行跨域配置 实现前后端不同tomcat下的前后端分离技术
//全局配置类
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        配置访问任何允许跨域--域访问的路径
        registry.addMapping("/**")
//                添加跨域来源
                .allowedOrigins("Http://localhost:8080","null")
//                规定允许跨域的方法：5个
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
//                允许携带信息通过跨域请求
                .allowCredentials(true)
//                设置最大响应时间
                .maxAge(3600);
//                .addResourceHandler("/static/**").addResourceLocations( "classpath:/static/");
    }
}
