package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1") //기본경로 /v1/users
public class UsersController {

    @Autowired
    UsersRepository usersRepository;


    //유저추가
    @PostMapping(value="/users")
    public Object join(@RequestBody Users users){

        int telCount = usersRepository.countByTel(users.getTel());
        int emailCount = usersRepository.countByEmail(users.getEmail());

        //db안에 tel이나 email값이 하나라도 존재하면
        if(telCount > 0){
            String msg = "중복된 전화번호입니다.";
            return msg;

        }else if(emailCount > 0){
            String msg = "중복된 이메일입니다.";
            return msg;
        }else{
            usersRepository.save(users);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }


    //Like검색
    @GetMapping(value="/users")
    public Object findUser(@RequestParam String tel){

            List<Users> result = usersRepository.findByTelContaining(tel);
            long count = usersRepository.countByTelContaining(tel);

            if(count < 1){
                String msg = "검색 결과가 없습니다.";
                return msg;
            } else{
                return result;
            }
    }

}


