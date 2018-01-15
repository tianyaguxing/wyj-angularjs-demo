package com.wyj.service;

import java.util.List;

import com.wyj.entity.User;

/**
 * 用户Service
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月15日 上午10:36:32
 */
public interface UserService {
    /**
     * 新增
     * 
     * @param entity
     * @return
     */
    int save(User entity);


    /**
     * 根据id查询详情
     * 
     * @param id
     * @return
     */
    User getObjectById(Object id);

    /**
     * 更新
     * 
     * @param t
     * @return
     */
    int update(User entity);


    /**
     * 批量删除
     * 
     * @param id
     * @return
     */
    int batchRemove(Object[] id);


    /**
     * 查询列表
     * 
     * @return
     */
    List<User> list();

    /**
     * 查询列表
     * @return
     */
    List<User> list(User entity);
    
}
