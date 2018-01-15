package com.wyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyj.dao.UserMapper;
import com.wyj.entity.User;
import com.wyj.service.UserService;

/**
 * 用户ServiceImpl
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月15日 上午10:44:15
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public int save(User entity) {
        return userMapper.save(entity);
    }

    @Override
    public User getObjectById(Object id) {
        return userMapper.getObjectById(id);
    }

    @Override
    public int update(User entity) {
        return userMapper.update(entity);
    }

    @Override
    public int batchRemove(Object[] id) {
        return userMapper.batchRemove(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public List<User> list(User entity) {
        return userMapper.list(entity);
    }

}
