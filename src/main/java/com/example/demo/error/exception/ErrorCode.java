package com.example.demo.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(400, " Invalid Input Value"),
    METHOD_NOT_ALLOWED(405, " Invalid Input Value"),
    ENTITY_NOT_FOUND(400, " Entity Not Found"),
    INTERNAL_SERVER_ERROR(500, "Server Error"),
    INVALID_TYPE_VALUE(400, " Invalid Type Value"),
    HANDLE_ACCESS_DENIED(403, "Access is Denied"),
    NOT_FOUND(404, " No handler found for your request"),


    // Member
    EMAIL_DUPLICATION(400, "Email is Duplication"),
    LOGIN_INPUT_INVALID(400, "Login input is invalid"),

    // Coupon
    COUPON_ALREADY_USE(400, "Coupon was already used"),
    COUPON_EXPIRE(400, "Coupon was already expired");


    private int code;
    private final String message;


    ErrorCode(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return code;
    }


}
