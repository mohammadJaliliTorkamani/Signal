package com.seeds.signal.Entity;

public class ServerSimpleResponse {
    private int code;
    private String description;
    private Object object;

    public ServerSimpleResponse(int code, String description, Object object) {
        this.code = code;
        this.description = description;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
