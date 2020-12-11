/*
package com.example.demo.advice;

import com.example.demo.response.CommonResult;
import com.example.demo.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private final ResponseService responseService;


    @ExceptionHandler(Exception.class) //괄호안은 최상위 예외객체임(제일먼저 예외처리)
    @ResponseStatus(HttpStatus.OK)
    protected CommonResult defaultException(HttpServletRequest, Exception e){};
}
*/
