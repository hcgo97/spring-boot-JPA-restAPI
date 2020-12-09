package com.example.demo.errors.exception;

public enum ErrorCode {

    //에러코드 정의
    INVALID_INPUT_VALUE("400 실패!", " Invalid Input Value"),
    INVALID_TYPE_VALUE("400 실패!", " Invalid Input Value"),
    ENTITY_NOT_FOUND("400 실패!", " Entity Not Found"),
    INTERNAL_SERVER_ERROR("500 실패!", " Internal server error");

    private final String code;
    private final String message;
    private int status;

    ErrorCode(final String code, final String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }
    public String getMessage() {
        return this.message;
    }
    public int getStatus() {return this.status; }
}
