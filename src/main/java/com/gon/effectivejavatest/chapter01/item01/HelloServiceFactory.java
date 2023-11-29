package com.gon.effectivejavatest.chapter01.item01;//package me.whiteship.chapter01.item01;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory{

    //문제3 ) implements HelloService 를 받을 경우 해당 HelloServiceFactory class는 하나의 구현만 가능하다.
    // lang에 따라서 korean, english 구현부로 나눠야 할 경우 어떻게 하면 되나? -> 정적팩토리 이용

    //방법 1) 다른 타입의 인스턴스를 리턴할 수 있다.
    public static HelloService of(String lang){
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        }else{
            return new EnglishHelloService();
        }
    }

    //방법 2) java 8 이후에 가능한 interface 내부에 static 매서드로 구현하기 -> 인터페이스 내부에 구현체 가능해짐
    // 구지 factory 클래스를 만들 필요가 없어진다!



    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("ko"); //반환 타입이 인터페이스 타입이 된다. -> 인터페이스를 사용하도록 강제함
        HelloService en = HelloServiceFactory.of("en");

        //default 메서드 : interface의 static 메소드 와 동일하게 interface내에 매서드 구현이 가능하다. -> 차이는 default는 재정의가 가능하다.
        HelloService helloService = new HelloService() {
            @Override
            public String hello() {
                return null;
            }

            @Override
            public void test() {
                System.out.println("HelloServiceFactory.test");
            }
        };

        helloService.test();



    }


}






