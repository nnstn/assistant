package com.nnstn.assistant.service.impl;

import com.nnstn.assistant.dao.UserMapper;
import com.nnstn.assistant.po.User;
import com.nnstn.assistant.service.BaseService;
import com.nnstn.assistant.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return new User();
    }

    @Override
    public User register(User user) {
        userMapper.insert(user);
        return user;
    }
}
