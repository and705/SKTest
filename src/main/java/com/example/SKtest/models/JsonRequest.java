package com.example.SKtest.models;


public class JsonRequest {

    int id;

    int add;

    public JsonRequest(int id, int add) {
        this.id = id;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
