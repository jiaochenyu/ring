package com.guanweiming.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author  https://github.com/zziaguan/
 */
@Entity
data class User(
        var name: String="",
        var age: Long=0,
        @Id @GeneratedValue @Column(unique = true)
        var id: Long= 0
)