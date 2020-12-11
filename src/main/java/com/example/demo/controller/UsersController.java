package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.response.CommonResult;
import com.example.demo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1") //기본경로 /v1/users
public class UsersController {

    @Autowired
    UsersRepository usersRepository;
    @Autowired
    ResponseService responseService;


    //유저추가
    @PostMapping(value="/users")
    public Object join(@RequestBody Users users){

        int telCount = usersRepository.countByTel(users.getTel());
        int emailCount = usersRepository.countByEmail(users.getEmail());

        //db안에 tel이나 email값이 하나라도 존재하면
        if(telCount > 0){
            return responseService.getTelFailResult();

        }else if(emailCount > 0) {
            return responseService.getEmailFailResult();

        }else{
            usersRepository.save(users);

            return new ResponseEntity<>(responseService.createSuccessResult(),(HttpStatus.CREATED));
        }
    }


    //Like검색
    @GetMapping(value="/users")
    public CommonResult findUser(@RequestParam String tel){

        int count = (int) usersRepository.countByTelContaining(tel);

        if(count < 1){
            return responseService.getSearchFailResult();
        }else if (count == 1) {
            return responseService.getSingleResult(usersRepository.findByTelContaining(tel).get(0));
        }else{
            return responseService.getListResult(usersRepository.findByTelContaining(tel));
        }


    }

}


