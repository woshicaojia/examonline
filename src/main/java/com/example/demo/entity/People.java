package com.example.demo.entity;

public class People {
     String pid;
     String name;
     String birthday;
     String email;

    public People() {
    }

    public People(String id, String username, String birthday, String email) {
        this.pid = id;
        this.name = username;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String id) {
        this.pid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + pid + '\'' +
                ", username='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
