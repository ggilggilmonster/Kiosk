package com.example.kiosk

open class MainMenu{
    open fun food() {
        println("[1] 햄버거        | 정준하도 야무~지게~ 먹고 간 수제버거")
        println("[2] 튀김류        | 매일 새 기름으로 튀기는 튀김")
        println("[3] 음료수        | 바리스타 출신 사장님이 직접 주는 음료")
        println("[0] 주문 취소")
    }

    open fun handMade() {
        println("[1] 낄낄버거")
        println("[2] 몬스터버거")
        println("[3] 낄낄몬스터버거")
        println("[0] 이전")
    }

    open fun newOil() {
        println("[1] 감자 튀김")
        println("[2] 치킨 너겟")
        println("[3] 치즈 스틱")
        println("[0] 이전")
    }

    open fun barista() {
        println("[1] 탄산 음료")
        println("[2] 낄몬 커피(시그니처 커피)")
        println("[3] 낄몬 수제 맥주")
        println("[0] 이전")
    }
}