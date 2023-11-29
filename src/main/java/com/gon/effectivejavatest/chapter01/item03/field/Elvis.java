package com.gon.effectivejavatest.chapter01.item03.field;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 코드 3-1 public static final 필드 방식의 싱글턴 (23쪽)
public class Elvis implements IElvis, Serializable {

    /**
     * 싱글톤 오브젝트
     * 싱글톤으로 private 생성자를 만들고 인스턴스는 하나만 생성하도록 만든다.
     */

//    1) 문제 : 싱글톤으로 생성시 재생성을 막으려면 어떻게?
    private Elvis() {
//        if (created) {
//            throw new UnsupportedOperationException("can't be created by constructor.");
//        }
//
//        created = true;
    }

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) throws Exception{

        Elvis instance = INSTANCE;
        System.out.println("instance = " + instance);
        //getDeclaredConstructor : 모든 생성자에 접근
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        Elvis elvis = declaredConstructor.newInstance();
        System.out.println("elvis = " + elvis);
        System.out.println(instance == elvis);
    }

    private Object readResolve() {
        return INSTANCE;
    }


}
