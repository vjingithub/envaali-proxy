package com.envaali.exception;

public class EnvaaliException extends RuntimeException {
    String messString;

    public EnvaaliException(String message) {
        this.messString = message;
    }
}
