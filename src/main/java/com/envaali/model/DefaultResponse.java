package com.envaali.model;

import lombok.Data;

@Data
public class DefaultResponse {
    public DefaultResponse(String name) {
        this.name = name;
    }
    String name;
}
