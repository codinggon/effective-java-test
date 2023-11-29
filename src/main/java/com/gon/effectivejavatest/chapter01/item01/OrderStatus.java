package com.gon.effectivejavatest.chapter01.item01;

import java.util.Arrays;

public enum OrderStatus {

    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        //문제 1: foreach 를 사용 값만 출력
        OrderStatus[] values = OrderStatus.values();
        Arrays.stream(values).forEach(System.out::println);

        //문제 2: foreach 를 사용 값만 출력
        Order order = new Order();


    }

}
