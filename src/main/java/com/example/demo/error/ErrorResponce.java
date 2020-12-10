package com.example.demo.error;

import com.example.demo.error.exception.ErrorCode;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class ErrorResponse {

    private int code;
    private String message;

    private ErrorResponse(final ErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public ErrorResponse(final int code, final String message, HttpStatus notFound) {
        this.code = code;
        this.message = message;
    }


    public static ErrorResponse of(final ErrorCode code) {
        return new ErrorResponse(code);
    }



}