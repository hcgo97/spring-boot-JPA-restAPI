/*
package com.example.demo.service;

import com.example.demo.repository.UsersRepository;
import com.example.demo.domain.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService{

    @Autowired
    private UsersRepository usersRepository;

    public List<UsersVO> findAll(){
        List<UsersVO> member = new ArrayList<>();
        usersRepository.findAll().forEach(e -> member.add(e));
        return member;
    }

    public List<UsersVO> findByTel(String tel){
        List<UsersVO> member = usersRepository.findByTel(tel);
        return member;
    }

    public UsersVO save(UsersVO member){
        usersRepository.save(member);
        return member;
    }

}
*/
