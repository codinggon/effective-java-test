package com.gon.effectivejavatest.chapter01.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {

    String valueOf(Integer integer);

    static String hello() {
        return "hello";
    }




}
