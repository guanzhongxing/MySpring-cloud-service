package cn.itmuch.cloud.controller;

import cn.itmuch.cloud.dao.UserRepository;
import cn.itmuch.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("coming...");
        return this.userRepository.findById(id).orElse(null);
    }

}
