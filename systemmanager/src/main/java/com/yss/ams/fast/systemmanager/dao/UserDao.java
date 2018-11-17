package com.yss.ams.fast.systemmanager.dao;

import com.yss.ams.fast.systemmanager.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryByName(String name);
}
