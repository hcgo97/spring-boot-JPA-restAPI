package com.example.demo.advice;

import com.example.demo.advice.exception.*;
import com.example.demo.response.CommonResult;
import com.example.demo.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private final ResponseService responseService;

    //번호중복
    @ExceptionHandler(TelDuplicateException.class) //(괄호안에 적용할 클래스)
    @ResponseStatus(HttpStatus.OK)
    protected CommonResult telNotFoundException(HttpServletRequest Request, TelDuplicateException e){

        return responseService.getTelFailResult(); //미리정의된것중에 괄호안에있는거 젤먼저찾아서바꿈
    }

    //이메일중복
    @ExceptionHandler(EmailDuplicateException.class) //(괄호안에 적용할 클래스)
    @ResponseStatus(HttpStatus.OK)
    protected CommonResult emailNotFoundException(HttpServletRequest Request, TelDuplicateException e){

        return responseService.getEmailFailResult(); //미리정의된것중에 괄호안에있는거 젤먼저찾아서바꿈
    }

    //검색실패
    @ExceptionHandler(TelNotFoundException.class) //(괄호안에 적용할 클래스)
    @ResponseStatus(HttpStatus.OK)
    protected CommonResult telNotFoundException(HttpServletRequest Request, TelNotFoundException e){

        return responseService.getSearchFailResult(); //미리정의된것중에 괄호안에있는거 젤먼저찾아서바꿈
    }

}
