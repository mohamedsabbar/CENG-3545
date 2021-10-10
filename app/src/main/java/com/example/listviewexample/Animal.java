package com.example.listviewexample;

public class Animal {
private String type;
private String picID;

    public Animal(String type, String picID) {
        this.type = type;
        this.picID = picID;
    }

    public String getType() {
        return type;
    }

    public int getPicID() {
        return picID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPicID(String picID) {
        this.picID = picID;
    }
}
