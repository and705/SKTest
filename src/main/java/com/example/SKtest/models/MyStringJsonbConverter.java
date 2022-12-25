package com.example.SKtest.models;

import com.google.gson.Gson;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class MyStringJsonbConverter implements AttributeConverter<JsonDb, String> {
    private final static Gson GSON = new Gson();

    @Override
    public String convertToDatabaseColumn(JsonDb jsonDb) {
        return GSON.toJson(jsonDb);
    }

    @Override
    public JsonDb convertToEntityAttribute(String s) {
        return GSON.fromJson(s, JsonDb.class);
    }
}
