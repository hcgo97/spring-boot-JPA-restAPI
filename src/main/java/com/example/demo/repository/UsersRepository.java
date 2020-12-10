package com.example.demo.repository;

import com.example.demo.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    public List<Users> findByTelContaining(String tel);

    public long countByTelContaining(String tel);


    public int countByTel(String tel);

    public int countByEmail(String email);
}
