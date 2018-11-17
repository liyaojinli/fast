package com.yss.ams.fast.systemmanager.service;


import com.yss.ams.fast.systemmanager.dao.UserDao;
import com.yss.ams.fast.systemmanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public List<User> queryByName(String name) {
        return dao.queryByName(name);
    }
}
