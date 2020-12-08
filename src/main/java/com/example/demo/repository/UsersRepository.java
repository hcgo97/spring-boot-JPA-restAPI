package com.example.demo.repository;

import com.example.demo.domain.UsersVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersVO, Long> {
/*
    public List<UsersVO> findByTel(String tel);

    //like검색
    public List<UsersVO> findByTelLike(String keyword);*/
}
