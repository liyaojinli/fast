package com.yss.ams.fast.systemmanager.dao;

import com.yss.ams.fast.systemmanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<User> queryByName(String name) {
        List<User> users = template.query("select * from t_s_user a where a.c_user_name = ?",
                new Object[]{name}, new BeanPropertyRowMapper(User.class));
        return users;
    }
}
