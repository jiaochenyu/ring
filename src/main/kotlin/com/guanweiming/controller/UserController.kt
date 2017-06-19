package com.guanweiming.controller

import com.guanweiming.domain.User
import com.guanweiming.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @author  https://github.com/zziaguan/
 */
@Api(description = "用户接口")
@RestController
@RequestMapping("/user/")
class UserController @Autowired constructor( val userService: UserService){

    @ApiOperation(value = "获取所有用户",notes = "获取所有用户列表")
    @GetMapping("list")
    fun list()=userService.list()

    @PostMapping("save")
    fun add(@RequestBody user:User)=userService.save(user)
}