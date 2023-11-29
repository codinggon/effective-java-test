package com.gon.effectivejavatest.chapter01.item01;

import java.util.EnumSet;
import java.util.Set;

public class Product {

    public static void main(String[] args) {

        //같은 인스턴스를 사용하는 것을 알 수 있다.
        Settings settings1 = Settings.getInstance();
        System.out.println("settings1 = " + settings1);
        Settings settings2 = Settings.getInstance();
        System.out.println("settings2 = " + settings2);

        //valueOf에서 매개변수에 따라 다른 상수를 리턴하는 것을 볼 수 있다.
        Boolean.valueOf("aa");

    }
}
