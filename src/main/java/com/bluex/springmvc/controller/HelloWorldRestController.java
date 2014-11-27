package com.bluex.springmvc.controller;

import com.bluex.springmvc.domain.User;
import com.bluex.springmvc.service.UserService;
import com.bluex.springmvc.system.MD5;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 001233 on 2014/11/20.
 */
@RestController
public class HelloWorldRestController {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String sysTime = simpleDateFormat.format(new Date());

    private UserService userService;

    @Inject
    public HelloWorldRestController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String Hello(){
        return "Hello Bluex!";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User login (@RequestBody User user){

        User newuser =userService.validLogin(user.getUsername(), user.getPassword());
        System.out.println("Method POST Name ="+ user.getUsername());
        System.out.println("Method POST Pass ="+ user.getPassword());

        if ( newuser != null ){
            //Vaild User

            //1 生成Token,保存Token
            String token = MD5.getMD5(newuser.getUsername());

            newuser.setToken(token);
            newuser.setTokentime(sysTime);
            String accesstoken = userService.saveToken(newuser);
            System.out.println("accessToken ="+accesstoken);
            //2 生成基本用户信息,用户名,记录,token
            //3 返回json


        }else{
            //error

        }


        return newuser;
    }


/**
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player){
        Message msg = new Message(player,"Hello "+player);
        return msg;
    }
 */
}
