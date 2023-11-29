package com.gon.effectivejavatest.chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {

    //throw를 선언 안해도 되는데 선언하는 경우 -> client에게 명시적으로 알려주고 싶을때
    public void updateDeliveryDate(LocalDate deliveryDate) throws IllegalArgumentException{
        if (deliveryDate == null) {
            throw new NullPointerException("deliveryDate can't be null");
        }


        if (deliveryDate.isBefore(LocalDate.now())) {
            //TODO 과거로 배송 해달라고??
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }

        // 배송 날짜 업데이트
    }

}
