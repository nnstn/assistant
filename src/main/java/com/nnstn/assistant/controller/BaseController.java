package com.nnstn.assistant.controller;

import com.nnstn.assistant.domain.Constants;
import com.nnstn.assistant.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    public User getCurrentUser(HttpServletRequest request){
        logger.info("获取当前用户");
        return (User) request.getSession().getAttribute(Constants.CURRENT_USER_SESSION);
    }
    public User setCurrentUser(HttpServletRequest request,User user){
        logger.info("用户登录："+user.getUsername());
        return (User) request.getSession().getAttribute(Constants.CURRENT_USER_SESSION);
    }
}
