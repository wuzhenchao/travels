package com.youha.controller;

import com.youha.model.User;
import com.youha.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;


/**
 * Created by zhenchao on 16/8/6.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping( value = "/user/{id}")
    public User getMyName(@PathVariable Integer id) {
        redisTemplate.opsForValue().set("china","china");
        String china  = (String) redisTemplate.opsForValue().get("china");
        User user  = userService.getUserById(id);
        logger.info("user 's  id is " +user.getId());
        return user;
    }

    @RequestMapping("/user")
    public User getIdMyName(@RequestParam("id") Integer id) {
        redisTemplate.opsForValue().set("china","china");
        String china  = (String) redisTemplate.opsForValue().get("china");
        User user  = userService.getUserById(id);
        logger.info("user 's  id is " +user.getId());
        return user;
    }
}
