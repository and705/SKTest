package com.example.SKtest.models;

import java.io.Serializable;

public class JsonDb implements Serializable {
    private int current;

    public JsonDb(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "{\"current\":" + current +
                "}";
    }
}
