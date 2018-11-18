package com.nnstn.assistant.controller;

import com.nnstn.assistant.domain.Result;
import com.nnstn.assistant.po.User;
import com.nnstn.assistant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
@RequestMapping("/nnstn/auth")
public class AuthController extends BaseController{
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Object login(HttpServletRequest request, String username, String password, String captcha){
        logger.info("用户登录 username："+username);
        Map map = new HashMap();
        map.put("username", username);
        map.put("password", password);
        map.put("captcha", captcha);
        System.out.printf(String.valueOf(map));
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User userinfo = userService.login(user);
        setCurrentUser(request, userinfo);

        return Result.success();
    }
    @RequestMapping("/register")
    public Object register(HttpServletRequest request,@RequestBody User user){
        userService.register(user);
        //保存用户session状态
        setCurrentUser(request, user);
        return Result.success();
    }
    @RequestMapping("leadToLogin")
    public void leadToLogin(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://github.com/login/oauth/authorize?" +
                "client_id=wangjn_bj&" +
                "redirect_uri=http://localhost:8090/index");
    }
}
