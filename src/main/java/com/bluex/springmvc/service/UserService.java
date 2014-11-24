package com.bluex.springmvc.service;

import com.bluex.springmvc.domain.Users;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public interface UserService {



    public List<Users> getUserByID(int id);

    public List<Users> getUserByName(String name);

    public int validLogin(String user,String pass);
}
