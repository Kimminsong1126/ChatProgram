package com.minsong.chatprogram

data class Message(
    var message: String?,
    var sendId: String
){
    constructor():this("", "")
}
