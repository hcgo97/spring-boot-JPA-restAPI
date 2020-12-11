package com.example.demo.advice.exception;

public class CreateException extends RuntimeException{

    public CreateException(String msg, Throwable t){
        super(msg, t);
    }

    public CreateException(String msg){
        super(msg);
    }

    public CreateException(){
        super();
    }

}
