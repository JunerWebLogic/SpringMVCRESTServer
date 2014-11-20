package com.bluex.springmvc.controller;

import com.bluex.springmvc.domain.Message;
import com.bluex.springmvc.domain.Users;
import com.bluex.springmvc.service.UserService;
import org.hibernate.service.spi.InjectService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 001233 on 2014/11/20.
 */
@RestController
public class HelloWorldRestController {

    private UserService userService;

    @Inject
    public HelloWorldRestController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/hello/{username}")
    public Users getUserInfo(@PathVariable String username){
        List<Users> user = userService.getUserByName(username);
        Users user1 = new Users();

        for (Users a : user){
            System.out.println("HelloWorldControl id ="+a.getId());
            System.out.println("HelloWorldControl user ="+a.getUsername());
            System.out.println("HelloWorldControl pass ="+a.getPassword());
            user1 = a;
        }

        return user1;
    }

    @RequestMapping("/")
    public String Hello(){
        return "Hello Bluex!";
    }


/**
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player){
        Message msg = new Message(player,"Hello "+player);
        return msg;
    }
 */
}
