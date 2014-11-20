package com.bluex.springmvc.service.impl;

import com.bluex.springmvc.dao.UserDao;
import com.bluex.springmvc.domain.Users;
import com.bluex.springmvc.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public  void setUserDao(UserDao userDao){
        this.userDao= userDao;
    }

    @Override
    @Transactional
    public List<Users> getUserByNameAndPass(Users user) {

        List<Users> users = this.userDao.findByNameAndPass(user);

        return users;
    }

    @Override
    @Transactional
    public List<Users> getUserByID(int id) {

        List<Users> user = this.userDao.findByID(id);

        return user;
    }

    @Override
    @Transactional
    public List<Users> getUserByName(String name) {

        List<Users> user = this.userDao.findByName(name);

        return user;
    }
}
