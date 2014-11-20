package com.bluex.springmvc.domain;

/**
 * Created by 001233 on 2014/11/20.
 */
public class Message {
    String name;
    String text;
    public Message(String name,String text){
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
