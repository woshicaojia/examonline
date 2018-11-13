package com.example.demo.entity;

public class Manager {
    private String sysid;

    private String managerid;

    private String managername;

    private String managerpasswrod;

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getManagerpasswrod() {
        return managerpasswrod;
    }

    public void setManagerpasswrod(String managerpasswrod) {
        this.managerpasswrod = managerpasswrod == null ? null : managerpasswrod.trim();
    }
}