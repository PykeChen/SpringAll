package com.example.demo;

/**
 * User: cpy
 * Date: 2020/4/11
 * Time: 10:17 下午
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ApplicationContextAware实现类，用于获取当前的Spring容器
 * 注解不能少
 */
@Component
public class BeanUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    /**
     * Spring容器会在创建该Bean之后，自动调用该Bean的setApplicationContext方法
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        if(BeanUtils.applicationContext == null) {
            BeanUtils.applicationContext = applicationContext;
        }
    }

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }
}
