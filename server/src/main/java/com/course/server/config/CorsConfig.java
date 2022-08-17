//package com.course.server.config;//package com.course.server.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
////        registry.addMapping("/**")
////                .allowedOrigins("*")
////                .allowedHeaders(CorsConfiguration.ALL)
////                .allowedMethods(CorsConfiguration.ALL)
////                .allowCredentials(true)
////                .maxAge(3600); // 1小时内不需要再预检（发OPTIONS请求）
//
//        registry.addMapping("/**")//允许跨域的访问路径
//                .allowedOrigins("*")//允许跨域访问的源
//                .allowedHeaders("*")//允许跨域访问的header
//                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")//允许请求方法
//                .allowCredentials(true)//是否允许发送cookie
//                .maxAge(3600);//预检的间隔时间
//    }
//
//}
