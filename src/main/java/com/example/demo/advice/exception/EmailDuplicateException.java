package com.example.demo.advice.exception;

public class EmailDuplicateException extends RuntimeException{

    public EmailDuplicateException(String msg, Throwable t){
        super(msg, t);
    }

    public EmailDuplicateException(String msg){
        super(msg);
    }

    public EmailDuplicateException(){
        super();
    }

}
