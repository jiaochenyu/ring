package com.guanweiming.controller

import com.guanweiming.domain.User
import com.guanweiming.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @author  https://github.com/zziaguan/
 */
@RestController
@RequestMapping("/user/")
class UserController @Autowired constructor( val userService: UserService){

    @GetMapping("list")
    fun list()=userService.list()

    @PostMapping("save")
    fun add(@RequestBody user:User)=userService.save(user)
}