package edu.co.icesi.moviless3.model

data class User(
    var name:String,
    var career:String,
    var followers:Int,
    var following:Int,
    var description:String,
    var photoID:Int,
)