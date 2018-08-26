package cn.itmuch.cloud.controller;

import cn.itmuch.cloud.UserFeignClient;
import cn.itmuch.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/simple/{id}")
    public User findSimpleById(@PathVariable("id") Long id) {
        return userFeignClient.findById(id);
    }


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return null;
    }
}
