package cc.mrbird.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.mrbird.security.CommonResponse;

/**
 * @author MrBird
 */
@RestController
public class UserController {

    @GetMapping("index")
    public Object index(Authentication authentication){
        return authentication;
    }

    @GetMapping(value = "/getCode")
    public CommonResponse getCode(HttpServletRequest request, HttpServletResponse response){
        return new CommonResponse()
                .put("code",request.getParameter("code"))
                .put("state",request.getParameter("state"));
    }

    @GetMapping("/authentication")
    public Object authentication(Authentication authentication){
        return authentication;
    }
    
}
