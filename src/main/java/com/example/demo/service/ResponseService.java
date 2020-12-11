package com.example.demo.service;

import com.example.demo.domain.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.response.CommonResult;
import com.example.demo.response.SingleResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    public enum CommonResponse{
        SUCCESS(1, "성공"),
        FAIL(-1, "실패");

        int code;
        String msg;


        CommonResponse(int code, String msg){
            this.code = code;
            this.msg = msg;
        }

        public int getCode(){
            return code;
        }

        public String getMsg(){
            return msg;
        }
    }


    //검색실패결과처리
    public CommonResult getFailResult(){
        CommonResult result = new CommonResult();

        result.setCode(CommonResponse.FAIL.getCode());
        result.setMsg(CommonResponse.FAIL.getMsg());

        return result;
    }


    // 단일건 결과를 처리하는 메소드

    public <T> SingleResult<T> getSingleResult(T data) {

        SingleResult<T> result = new SingleResult<>();

        result.setData(data);
        setSuccessResult(result);

        return result;

    }


    //성공결과만 처리
    public CommonResult getSuccessResult(){

        CommonResult result = new CommonResult();
        setSuccessResult(result);

        return result;

    }

    //결과데이터에 성공결과처리 데이터 세팅해주는 메소드
    private void setSuccessResult(CommonResult result) {

        result.setCode(CommonResponse.SUCCESS.getCode());
        result.setMsg(CommonResponse.SUCCESS.getMsg());

    }


}
