package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity(name = "users") // 엔티티=JPA가 관리하는 클래스, 괄호안에꺼는 매핑할 테이블
@Data // getter+setter
public class Users {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동생성 = 기본키생성을 DB에 위
    private Long id;

    private String email;

    private String tel;

    private String name;





/*    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updateAt;*/

/*
    @Builder
    public UsersVO(String email, String tel, String name){
        this.email = email;
        this.tel = tel;
        this.name = name;
    }*/

}
