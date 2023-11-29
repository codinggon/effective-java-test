package com.gon.effectivejavatest.chapter01.item05.springioc;

import com.gon.effectivejavatest.chapter01.item01.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

//        SpellChecker spellChecker1 = new SpellChecker(); //이 SpellChecker는 스프링이 모르는 SpellChecker이다.

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);// AppConfig를 통해 싱글톤으로 만들어진 객체를 가져옴
        spellChecker.isValid("test");
    }
}
