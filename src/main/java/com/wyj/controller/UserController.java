package com.wyj.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.wyj.entity.Retval;
import com.wyj.entity.User;
import com.wyj.service.UserService;
/**
 * 用户Controller
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月15日 下午5:46:38
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return "/views/list";
    }
    
    @ResponseBody
    @RequestMapping(value = "/list")
    public String list() {
        List<User> list = userService.list();
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Retval save(User user) {
        Retval retval = Retval.newInstance();
        try {
            if (user.getUserId() == null) {
                userService.save(user);
            } else {
                userService.update(user);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return retval;
    }
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Retval edit(@PathVariable String id) {
        Retval retval = Retval.newInstance();
        User user = userService.getObjectById(Long.valueOf(id));
        retval.put("obj", user);
        return retval;
    }
    @ResponseBody
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public Retval remove(@RequestParam Long[] ids) {
        Retval retval = Retval.newInstance();
        try {
            userService.batchRemove(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            retval.fail(e.getMessage());
        }
        return retval;
    }

}
