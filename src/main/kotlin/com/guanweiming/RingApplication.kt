package com.guanweiming

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
class RingApplication : SpringBootServletInitializer(

)

fun main(args: Array<String>){
    SpringApplication.run(RingApplication::class.java, *args)
}
