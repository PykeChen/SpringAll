package com.example.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: cpy
 * Date: 2020/4/11
 * Time: 9:46 下午
 */
@Configuration
class MyBeanConfig {

    // ===========================================================
    // Constants
    // ===========================================================
    @Bean
    public Country country(){
        return new Country();
    }
    @Bean
    public UserInfo userInfo(){
        return new UserInfo(country());
    }
    @Bean
    public ComConfTest getComTest(){
        return new ComConfTest();
    }

    // ===========================================================
    // Fields
    // ===========================================================


    // ===========================================================
    // Override Methods
    // ===========================================================

    // ===========================================================
    // Define Methods
    // ===========================================================


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================


    // ===========================================================
    // Getter & Setter
    // ===========================================================  

}
