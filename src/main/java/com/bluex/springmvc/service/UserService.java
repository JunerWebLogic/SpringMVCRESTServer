package com.bluex.springmvc.service;

import com.bluex.springmvc.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public interface UserService {

    public User validLogin(String user,String pass);

    public String saveToken (User user);
}
