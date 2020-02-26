package com.ntuzy.leyou.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author IamZY
 * @create 2020/2/26 11:03
 */
@Configuration
public class LeyouCorsConfiguration {

    @Bean
    public CorsFilter corsFilter() {
        //
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://manage.ntuzy.com");
        corsConfiguration.setAllowCredentials(true);  // 是否允许携带Cookie
        corsConfiguration.addAllowedMethod("*"); // 代表所有的请求方法  get post put delete
        corsConfiguration.addAllowedHeader("*");  //允许携带任何头信息
        // 初始化Cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**", corsConfiguration);
        // CorsFilter 配置源对象
        return new CorsFilter(configurationSource);
    }


}
