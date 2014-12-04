package com.bluex.springmvc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "user_vacation")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class UserVaction {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "year")
    private String year;

    @Column(name = "leagal")
    private double leagal;

    @Column(name = "company")
    private double company;

    @Column(name = "remain_leagal")
    private double remain_leagal;

    @Column(name = "remain_company")
    private double remain_company;

    @Column(name = "leagal_d")
    private double leagal_d;

    @Column(name = "company_d")
    private double company_d;

    @Column(name = "remain_leagal_d")
    private double remain_leagal_d;

    @Column(name = "remain_company_d")
    private double remain_company_d;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getLegal() {
        return leagal;
    }

    public void setLegal(double legal) {
        this.leagal = legal;
    }

    public double getCompany() {
        return company;
    }

    public void setCompany(double company) {
        this.company = company;
    }

    public double getRemain_legal() {
        return remain_leagal;
    }

    public void setRemain_legal(double remain_legal) {
        this.remain_leagal = remain_legal;
    }

    public double getRemain_company() {
        return remain_company;
    }

    public void setRemain_company(double remain_company) {
        this.remain_company = remain_company;
    }

    public double getLegal_d() {
        return leagal_d;
    }

    public void setLegal_d(double leagal_d) {
        this.leagal_d = leagal_d;
    }

    public double getCompany_d() {
        return company_d;
    }

    public void setCompany_d(double company_d) {
        this.company_d = company_d;
    }

    public double getRemain_leagal_d() {
        return remain_leagal_d;
    }

    public void setRemain_leagal_d(double remain_leagal_d) {
        this.remain_leagal_d = remain_leagal_d;
    }

    public double getRemain_company_d() {
        return remain_company_d;
    }

    public void setRemain_company_d(double remain_company_d) {
        this.remain_company_d = remain_company_d;
    }
}
