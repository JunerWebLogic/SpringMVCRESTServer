package com.bluex.springmvc.dao.impl;

import com.bluex.springmvc.dao.UserDao;
import com.bluex.springmvc.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Administrator on 2014/11/20.
 */
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List get(Integer id) throws DataAccessException {
        //return (List<User>) this.hibernateTemplate.find("from User user where user.id=?",id);
        return this.sessionFactory.getCurrentSession()
                .createQuery("from User user where user.id=?")
                .setParameter(0,id)
                .list();
    }

    @Override
    public java.io.Serializable save(User user) {
        return this.sessionFactory.getCurrentSession()
                .save(user);
    }

    @Override
    public void saveToken(User user) {
        this.sessionFactory.getCurrentSession()
                .update(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByNameAndPass(String user, String pass) {
        // return (List<User>) this.hibernateTemplate.find("from User user where user.username=? and user.password=?",user.getUsername(),user.getPassword());
        return this.sessionFactory.getCurrentSession()
                .createQuery("from User user where user.username=? and user.password=?")
                .setParameter(0,user)
                .setParameter(1,pass)
                .list();
    }

}
