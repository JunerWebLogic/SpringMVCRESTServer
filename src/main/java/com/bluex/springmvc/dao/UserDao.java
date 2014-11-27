package com.bluex.springmvc.dao;

import com.bluex.springmvc.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public interface UserDao {
    List get(Integer id);

    java.io.Serializable save(User user);

    void saveToken(User user);

    void update(User user);

    void delete(User user);

    void delete(Integer id);

    List<User> findAll();

    List<User> findByNameAndPass(String user, String pass);

}
