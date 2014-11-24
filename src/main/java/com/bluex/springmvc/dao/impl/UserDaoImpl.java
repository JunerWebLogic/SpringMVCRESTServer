package com.bluex.springmvc.dao.impl;

import com.bluex.springmvc.dao.UserDao;
import com.bluex.springmvc.domain.Users;
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
        //return (List<Users>) this.hibernateTemplate.find("from Users user where user.id=?",id);
        return this.sessionFactory.getCurrentSession()
                .createQuery("from Users user where user.id=?")
                .setParameter(0,id)
                .list();
    }

    @Override
    public java.io.Serializable save(Users users) {
        return this.sessionFactory.getCurrentSession()
                .save(users);
    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void delete(Users users) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public List<Users> findByNameAndPass(String user, String pass) {
        // return (List<Users>) this.hibernateTemplate.find("from Users user where user.username=? and user.password=?",users.getUsername(),users.getPassword());
        return this.sessionFactory.getCurrentSession()
                .createQuery("from Users user where user.username=? and user.password=?")
                .setParameter(0,user)
                .setParameter(1,pass)
                .list();
    }

    @Override
    public List<Users> findByName(String name) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("from Users where username = ?")
                .setParameter(0,name )
                .list();
    }

    @Override
    public List<Users> findByID(int id) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("from Users where id = ?")
                .setParameter(0,id )
                .list();

    }
}
