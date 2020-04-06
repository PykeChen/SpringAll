package com.springboot.springbootlogback.interceptor;

import com.springboot.springbootlogback.domain.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by tengj on 2017/3/29.
 */
public class MyInterceptor implements HandlerInterceptor {

    //到此为止终于介绍完日志框架了，平时使用的时候推荐用自定义logback-spring.xml来配置，代码中使用日志也很简单，类里面添加
     private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag =true;
        String ip = request.getRemoteAddr();
        long startTime = System.currentTimeMillis();
        request.setAttribute("requestStartTime", startTime);
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            System.out.println("用户:"+ip+",访问目标:"+method.getDeclaringClass().getName() + "." + method.getName());
            logger.warn("logger tracer 用户:" + ip + ",访问目标:" + method.getDeclaringClass().getName() + "." + method.getName());

            //为了确保用户是已登录的状态
//            User user=(User)request.getSession().getAttribute("user");
//            if(null==user){
//                response.sendRedirect("toLogin");
//                flag = false;
//            }else{
//                flag = true;
//            }
            return flag;
        } else {
            return true;                          
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            long startTime = (Long) request.getAttribute("requestStartTime");
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            // 打印方法执行时间
            if (executeTime > 1000) {
                System.out.println("[" + method.getDeclaringClass().getName() + "." + method.getName() + "] 执行耗时 : "
                        + executeTime + "ms");
            } else {
                System.out.println("[" + method.getDeclaringClass().getSimpleName() + "." + method.getName() + "] 执行耗时 : "
                        + executeTime + "ms");
            }
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}