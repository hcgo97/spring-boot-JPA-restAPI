package com.example.demo.service;

import com.example.demo.response.CommonResult;
import com.example.demo.response.SingleResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    public enum CommonResponse{
        SUCCESS(200, "성공"),
        FAIL(200, "실패"),
        CREATE(201, "성공");

        int code;
        String message;


        CommonResponse(int code, String message){
            this.code = code;
            this.message = message;
        }

        public int getCode(){
            return code;
        }

        public String getMessage(){
            return message;
        }
    }


    //일반실패결과처리
    public CommonResult getFailResult(){
        CommonResult result = new CommonResult();

        result.setCode(CommonResponse.FAIL.getCode());
        result.setMessage(CommonResponse.FAIL.getMessage());

        return result;
    }


    //검색실패 커스텀
    public CommonResult getSearchFailResult(){
        CommonResult result = new CommonResult();

        result.setCode(CommonResponse.FAIL.getCode());
        result.setMessage("검색에 실패했습니다.");

        return result;
    }


    //중복체크 커스텀
    public CommonResult getTelFailResult(){
        CommonResult result = new CommonResult();

        result.setCode(CommonResponse.FAIL.getCode());
        result.setMessage("중복된 번호입니다.");

        return result;
    }

    public CommonResult getEmailFailResult(){
        CommonResult result = new CommonResult();

        result.setCode(CommonResponse.FAIL.getCode());
        result.setMessage("중복된 이메일입니다.");

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
        result.setMessage(CommonResponse.SUCCESS.getMessage());

    }





    //CREATE(201) 커스텀
    public CommonResult createSuccessResult(){

        CommonResult result = new CommonResult();
        setCreateResult(result);

        return result;
    }

    private void setCreateResult(CommonResult result) {

        result.setCode(CommonResponse.CREATE.getCode());
        result.setMessage(CommonResponse.CREATE.getMessage());
    }


}
