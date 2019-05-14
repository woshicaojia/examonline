package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Teacher {
    private String sysid;

    private String teacherid;

    private String password;

    public Teacher(){}

    public Teacher(String teacherid,String password){
        this.teacherid = teacherid;
        this.password = password;
    }

    public Teacher(String sysid,String teacherid,String password){
        this.sysid = sysid;
        this.teacherid = teacherid;
        this.password = password;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}