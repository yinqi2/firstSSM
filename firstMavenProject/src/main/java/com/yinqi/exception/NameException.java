package com.yinqi.exception;

public class NameException extends  Exception {
    private String message;

    public NameException(String message) {
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
