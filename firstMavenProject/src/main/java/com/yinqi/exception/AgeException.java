package com.yinqi.exception;

public class AgeException extends Exception {

    private String message;

    public AgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
