package com.gon.effectivejavatest.chapter01.item01;

public interface HelloService {

    public String hello();

    default void test(){
        System.out.println("HelloService.test");
    }

    //구현체 가능해짐
    public default HelloService of(String lang){
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        }else{
            return new EnglishHelloService();
        }
    }

    static String hi() {
        prepareMessage();
        return "hi";
    }

    default String bye(){
        return "bye";
    }

    static private void prepareMessage() {
    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }


}
