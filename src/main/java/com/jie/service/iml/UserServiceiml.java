package com.jie.service.iml;

import com.jie.dao.UserMapper;
import com.jie.entity.User;
import com.jie.entity.UserExample;
import com.jie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
@Service
public class UserServiceiml implements UserService {

    @Autowired
    private UserMapper userdao;

    @Override
    public List<User> getallUsers() {
        UserExample example = new UserExample();
        UserExample.Criteria cri = example.createCriteria();
        cri.andUuidIsNotNull();
        return userdao.selectByExample( example );
    }

    @Override
    public User getUser(String id) {
        UserExample example = new UserExample();
        UserExample.Criteria cri = example.createCriteria();
        cri.andUuidEqualTo( id );
        return userdao.selectByExample( example ).get( 0 );
    }

    @Override
    public User getUsername(String name) {
        UserExample example = new UserExample();
        UserExample.Criteria cri = example.createCriteria();
        cri.andNameEqualTo( name );
        return userdao.selectByExample( example ).get( 0 );
    }

    @Override
    public long deleteUser(String id) {
        User user = new User();
        user.setUuid( id );
        user.setIsout( "0" );

        return userdao.updateByPrimaryKeySelective( user );
    }

    @Override
    public long insertUser(User user) {
        return userdao.insertSelective( user );
    }

    @Override
    public long updateUser(User user) {
        return userdao.updateByPrimaryKeySelective( user );
    }
}
