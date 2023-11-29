package com.gon.effectivejavatest.chapter01.item01;

import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;


//    문제) Setting 유일한 인스턴스만 생성해서 만들어라 -> 정적 팩토리 사용 (인스턴스 통제)

    //1) 기본생성자 private -> 외부 생성 막기
    private Settings() {
    }

    //2) 정적팩토리
    //final 값 초기화 필수
    //static 인스턴스 생성이 아닌 메모리에 바로 올리기 ( 공유됨 )
    private static final Settings SETTINGS = new Settings();

    //3) 오직 정적 팩토리 방법으로 가져가도록..
    public static Settings getInstance(){
        return SETTINGS;
    }

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
