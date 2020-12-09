package com.example.demo.repository;

import com.example.demo.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    public List<Users> findByTelContaining(String tel);

//
//    @Query("SELECT COUNT(tel) FROM users WHERE tel LIKE '{find_tel}' ")
//    TypedQuery<Long> findCountByIdAndDateRangeGroupBySomeCondition(
//            @Param("tel") String tel, @Param("tel") String tel, @Param("tel") String tel;

}
