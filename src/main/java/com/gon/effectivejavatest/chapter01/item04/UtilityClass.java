package com.gon.effectivejavatest.chapter01.item04;

public abstract class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    private UtilityClass() {
        throw new AssertionError();
    }

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
//    private UtilityClass() {
//        throw new AssertionError();
//    }

    //문제 1) abstract로 막기 장/단점


    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {



    }
}
