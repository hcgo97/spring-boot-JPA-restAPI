package com.example.demo.advice.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(400, "Invalid Input Value"),
    METHOD_NOT_ALLOWED(405, "Invalid Input Value"),
    INTERNAL_SERVER_ERROR(500, "Server Error"),
    HANDLE_ACCESS_DENIED(403, "Access is Denied"),
    NOT_FOUND(404, "No handler found for your request");


    private int code;
    private final String message;


    ErrorCode(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return this.message;
    }

}
