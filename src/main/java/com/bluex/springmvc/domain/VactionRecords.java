package com.bluex.springmvc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "vacation_records")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class VactionRecords {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "yaer")
    private String year;

    @Column(name = "type")
    private String type;

    @Column(name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @Column(name = "total")
    private double total;

    @Column(name = "status")
    private String status;

}
