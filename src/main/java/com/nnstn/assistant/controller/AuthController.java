package com.nnstn.assistant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
@RequestMapping("/nnstn/auth")
public class AuthController{

    @RequestMapping("/login")
    public Object login(String username,String password,String captcha){
        Map map = new HashMap();
        map.put("username", username);
        map.put("password", password);
        map.put("captcha", captcha);
        return  map;
    }
}
