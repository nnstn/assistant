package com.nnstn.assistant.controller;

import com.nnstn.assistant.domain.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        System.out.printf(String.valueOf(map));
        Result result = Result.success();
        return result;
    }
    @RequestMapping("leadToLogin")
    public void leadToLogin(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://github.com/login/oauth/authorize?" +
                "client_id=wangjn_bj&" +
                "redirect_uri=http://localhost:8090/index");
    }

}
