package com.guanweiming.common

/**
 * @author  https://github.com/zziaguan/
 */

enum class ResponseCode(val code: Int, val desc: String) {
    SUCCESS(0, "SUCCESS"), ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT")

}