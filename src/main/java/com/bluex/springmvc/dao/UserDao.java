package com.bluex.springmvc.dao;

import com.bluex.springmvc.domain.Users;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public interface UserDao {
    List get(Integer id);

    java.io.Serializable save(Users users);

    void update(Users users);

    void delete(Users users);

    void delete(Integer id);

    List<Users> findAll();

    List<Users> findByNameAndPass(String user, String pass);

    List<Users> findByName(String name);

    List<Users> findByID(int id);

}
