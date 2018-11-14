package com.nnstn.assistant.service;

import com.nnstn.assistant.po.User;

public interface UserService {
    public User login(User user);
    public User register(User user);
}
