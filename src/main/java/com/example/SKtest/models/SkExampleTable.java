package com.example.SKtest.models;

import jakarta.persistence.*;


@Entity
@Table(name = "sk_example_table")

public class SkExampleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Convert(converter = MyStringJsonbConverter.class)
    @Column(columnDefinition = "jsonb")
    private JsonDb obj;

    public Integer getId() {
        return id;
    }

    public SkExampleTable() {
    }

    public SkExampleTable(JsonDb obj) {
        this.obj = obj;
    }

    public JsonDb getObj() {
        return obj;
    }

    public void setObj(JsonDb obj) {
        this.obj = obj;
    }

    public void setJsonProperty(JsonDb jsonProperty) {
        this.obj = jsonProperty;
    }

    @Override
    public String toString() {
        return "skExampleTable{" +
                "id=" + id +
                ", jsonProperty=" + obj +
                '}';
    }
}
