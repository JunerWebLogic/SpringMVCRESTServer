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

    private static final int LOGIN_SUCESS = 1;
    private static final int LOGIN_FAIL = 0 ;
    private UserDao userDao;

    public  void setUserDao(UserDao userDao){
        this.userDao= userDao;
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

    /**
     *
     * @param user
     * @param pass
     * @return 登陆后的身份确认:0为登陆失败,1为登陆成功.
     */
    @Override
    @Transactional
    public int validLogin(String user, String pass) {

        if(this.userDao.findByNameAndPass(user,pass).size() >= 1 ){
            return LOGIN_SUCESS;
        }else{
            return LOGIN_FAIL;
        }
    }
}
