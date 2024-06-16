package com.example.kiosk

fun main() {

    println("낄몬버거에 오신 걸 환영합니다!")

    var mainMenu = Food()
    var burger = Handmade()
    var fry = NewOil()
    var beverage = Barista()
    println("${mainMenu.food()}")
    println("주문하실 메뉴를 선택해주세요. 햄버거는 인 당 1개는 기본 주문입니다.")

    while(true) {

        var mainSelection = readLine()!!.toInt()
        when (mainSelection) {
            0 -> {
                println("홈으로 돌아가시겠습니까?")
                main()
            }

            1 -> {
                println("${burger.handMade()}")
                println("정준하도 야무지게~ 먹고 간 버거.")
                var burgerSelection = readLine()!!.toInt()
                when (burgerSelection) {
                    1 -> burger.ggilggil()
                    2 -> burger.monster()
                    3 -> burger.ggilmon()
                    0 -> println("이전")
                }
                println("추가 주문하실 메뉴를 선택해주세요.")
            }

            2 -> {
                println("${fry.newOil()}")
                println("매일 새 기름으로 튀기는 튀김.")
                var frySelecton = readLine()!!.toInt()
                when (frySelecton) {
                    1 -> fry.frenchFries()
                    2 -> fry.nuggets()
                    3 -> fry.cheeseStick()
                    0 -> println("이전")
                }
                println("추가 주문하실 메뉴를 선택해주세요.")
            }

            3 -> {
                println("${beverage.barista()}")
                println("바리스타 출신이 직접 제공하는 음료.")
                var beverageSelection = readLine()!!.toInt()
                when (beverageSelection) {
                    1 -> beverage.soda()
                    2 -> beverage.coffee()
                    3 -> beverage.beer()
                    0 -> println("이전")
                }
                println("추가 주문하실 메뉴를 선택해주세요.")
            }
        }
    }
}
