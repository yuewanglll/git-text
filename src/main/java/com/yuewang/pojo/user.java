package com.yuewang.pojo;



public class user {

private int id;
private String name;

    public user() {
    }

    public user(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
