package com.yss.ams.fast.systemmanager.service;

import com.yss.ams.fast.systemmanager.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryByName(String name);
}
