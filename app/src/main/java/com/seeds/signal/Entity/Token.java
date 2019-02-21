package com.seeds.signal.Entity;

public class Token {
    private String token;
    private String loginTime;

    public Token(String token, String loginTime) {
        this.token = token;
        this.loginTime = loginTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
