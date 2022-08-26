package com.caprepa.API.prueba.dtos;

import java.io.Serializable;

public class ErrorDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String Name;

    private String Value;

    public ErrorDto(String name, String value) {
        Name = name;
        Value = value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }
}
