package com.example.demo.repository;


import com.example.demo.DemoApplicationTests;
import com.example.demo.domain.UsersVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTests extends DemoApplicationTests {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void create(){
        UsersVO users = new UsersVO();

        users.setEmail("zz2342zz@naver.com");
        users.setTel("010444444");
        users.setName("김dd");

        UsersVO newUser = usersRepository.save(users);

    }
}
