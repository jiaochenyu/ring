package com.guanweiming.service

import com.guanweiming.common.ServerResponse
import com.guanweiming.dao.UserRepository
import com.guanweiming.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author  https://github.com/zziaguan/
 */
@Service
class UserService @Autowired constructor(val userRepository: UserRepository) {
    fun list() = userRepository.findAll()
    fun save(user: User): ServerResponse<User> {
        if (user.age < 18) {
            return ServerResponse.createByErrorMessage("年龄必须大于18岁")
        }
        val u: User = userRepository.findUserByName("关卫明") ?: return ServerResponse.createBySuccess(userRepository.save(user))
        return ServerResponse.createBySuccess(u)
    }
}
