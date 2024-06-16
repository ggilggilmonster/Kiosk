package com.example.kiosk

class Barista() : MainMenu() {

    fun soda() {
        var name = "탄산 음료"
        var price = 2000
        println("${name} ₩${price}")
    }

    fun coffee() {
        var name = "낄몬 커피(시그니처 커피)"
        var price = 4500
        println("${name} ₩${price}")
    }

    fun beer() {
        var name = "낄몬 수제 맥주"
        var price = 7000
        println("${name} ₩${price}")
    }
}