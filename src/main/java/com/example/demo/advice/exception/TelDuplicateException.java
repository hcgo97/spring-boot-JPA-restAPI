package com.example.demo.advice.exception;

public class TelDuplicateException extends RuntimeException{

    public TelDuplicateException(String msg, Throwable t){
        super(msg, t);
    }

    public TelDuplicateException(String msg){
        super(msg);
    }

    public TelDuplicateException(){
        super();
    }

}
