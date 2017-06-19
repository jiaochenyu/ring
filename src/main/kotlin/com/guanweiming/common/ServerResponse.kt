package com.guanweiming.common

import com.sun.javafx.font.directwrite.RECT
import java.io.Serializable

/**
 * @author  https://github.com/zziaguan/
 */

class ServerResponse<T> : Serializable {
    var data: T? = null
    var status: Int?
    var msg: String? = null

    private constructor(status: Int) {
        this.status = status
    }

    private constructor(status: Int, data: T) {
        this.status = status
        this.data = data
    }

    private constructor(status: Int, msg: String) {
        this.status = status
        this.msg = msg
    }

    companion object {
        fun <T> createBySuccess()
                = ServerResponse<T>(status = ResponseCode.SUCCESS.code)

        fun <T> createBySuccess(data: T)
                = ServerResponse(ResponseCode.SUCCESS.code, data)

        fun <T> createBuSuccessMessage(msg: String)
                = ServerResponse<T>(ResponseCode.SUCCESS.code, msg)

        fun <T> createByError()
                = ServerResponse<T>(status = ResponseCode.ERROR.code)

        fun <T> createByErrorMessage(msg: String)
                = ServerResponse<T>(status = ResponseCode.ERROR.code, msg = msg)

    }
}