package com.example.demo.controller;

/*@RestController
@RequestMapping("usersTest")*/
public class UsersController {

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


}
