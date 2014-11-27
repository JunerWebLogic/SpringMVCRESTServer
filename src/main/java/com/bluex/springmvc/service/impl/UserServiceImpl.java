package com.bluex.springmvc.service.impl;

import com.bluex.springmvc.dao.UserDao;
import com.bluex.springmvc.domain.User;
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

    /**
     *
     * @param name
     * @param pass
     * @return 登陆后的身份确认:0为登陆失败,1为登陆成功.
     */
    @Override
    @Transactional
    public User validLogin(String name, String pass) {

        User user = new User();

        if (this.userDao.findByNameAndPass(name, pass).size()>0){
            user = this.userDao.findByNameAndPass(name,pass).get(0);
        }else{
            user = null;
        }
        return user;
    }

    @Override
    @Transactional
    public String saveToken(User user) {
        this.userDao.saveToken(user);
        return user.getToken();
    }
}
