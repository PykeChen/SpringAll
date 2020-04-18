package com.example.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: cpy
 * Date: 2020/4/11
 * Time: 9:35 下午
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
@Component
public class ComConfTest {

    // ===========================================================
    // Constants
    // ===========================================================
    @Autowired
    public Country country;

    @Autowired
    public UserInfo userInfo;

    @Test
    public void myTest() {
        boolean result = userInfo.getCountry() == country;
        System.out.println(result ? "同一个country" : "不同的country");
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
