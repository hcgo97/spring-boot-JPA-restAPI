package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1") //기본경로 /v1/users
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    //유저추가
    @RequestMapping(value="/users", method=RequestMethod.POST)
    public ResponseEntity<Void>join(@RequestBody Users users){
        Users newUser = usersRepository.save(users);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Like검색
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<Users> findUser(@RequestParam String tel){
        log.debug("tel- {}", tel);
        List<Users> result = usersRepository.findByTelContaining(tel);

        return result;

    }

}














/*    //기본형
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsersService usersService;

    //모든 회원 조회
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<UsersVO>> getAllusers(){
        List<UsersVO> member = UsersService.findALL();
        return new ResponseEntity<List<UsersVO>>(member, HttpStatus.OK);
    }

    //전화번호 where검색
    @GetMapping(value = "/{tel}", produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UsersVO> getUsers(@PathVariable("tel") String tel){
        List<UsersVO> member = UsersService.findByTel(tel);
        return new ResponseEntity<UsersVO>(member.get(), HttpStatus.OK);
    }

    //회원입력
    @PostMapping
    public ResponseEntity<UsersVO> save(UsersVO member){
        return new ResponseEntity<UsersVO>(UsersService.save(member), HttpStatus.OK);
    }

    //회원입력
    @PostMapping(value = "/saveUsers")
    public ResponseEntity<UsersVO> save(HttpServletRequest req, UsersVO member){
        return new ResponseEntity<UsersVO>(UsersService.save(member), HttpStatus.OK);
    }*/

