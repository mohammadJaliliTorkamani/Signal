package com.seeds.signal.Entity;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String image;
    private long secretKey;
    private String username;//id
    private String registerTime;
    private int permission;

    public User(int id, String name, String lastName, String image, long secretKey, String username, String registerTime, int permission) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.image = image;
        this.secretKey = secretKey;
        this.username = username;
        this.registerTime = registerTime;
        this.permission = permission;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}
