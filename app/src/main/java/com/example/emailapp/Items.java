package com.example.emailapp;

import android.view.View;



public class Items{
    public Items(String subject, String desc, int image) {
        this.subject = subject;
        this.desc = desc;
        this.image = image;
    }

    private String subject,desc;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int image;


}
