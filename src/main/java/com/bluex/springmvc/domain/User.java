package com.bluex.springmvc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2014/11/20.
 */
@Entity
@Table( name ="user")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "username",fetch = FetchType.LAZY)
    private Set<UserVaction> userVaction;

    public Set<UserVaction> getUserVaction() {
        return userVaction;
    }

    public void setUserVaction(Set<UserVaction> userVaction) {
        this.userVaction = userVaction;
    }

    @OneToMany(mappedBy = "username",fetch = FetchType.LAZY)
    private Set<VactionRecords> vactionRecords = new HashSet<VactionRecords>();

    public Set<VactionRecords> getVactionRecords() {
        return vactionRecords;
    }

    public void setVactionRecords(Set<VactionRecords> vactionRecords) {
        this.vactionRecords = vactionRecords;
    }




    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokentime() {
        return tokentime;
    }

    public void setTokentime(String tokentime) {
        this.tokentime = tokentime;
    }

    @Column(name = "tokentime")
    private String tokentime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}