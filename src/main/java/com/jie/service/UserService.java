package com.jie.service;

import com.jie.entity.User;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public interface UserService {

    List<User> getallUsers();

    User getUser(String id);

    User getUsername(String name);

    long deleteUser(String id);

    long insertUser(User user);

    long updateUser(User user);
}
