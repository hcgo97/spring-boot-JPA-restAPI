package com.example.demo.advice.exception;

public class TelNotFoundException extends RuntimeException{

    public TelNotFoundException(String msg, Throwable t){
        super(msg, t);
    }

    public TelNotFoundException(String msg){
        super(msg);
    }

    public TelNotFoundException(){
        super();
    }

}
