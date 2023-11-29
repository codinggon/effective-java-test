package com.gon.effectivejavatest.chapter01.item05.staticutils;

import com.gon.effectivejavatest.chapter01.item05.DefaultDictionary;
import com.gon.effectivejavatest.chapter01.item05.Dictionary;
import com.gon.effectivejavatest.chapter01.item05.factorymethod.DictionaryFactory;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    //new Dictionary로 만들경우
    //KoreaSpellChecker를 만들어서 또 dictionary를 생성해야한다.
    //SpellChecker 코드의 재사용을 위해서 -> Dictionary를 interface로 만들면 된다
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    //자원을 만들어주는 팩토리를 만들어 -> 중간 단계 추가하기
    //Dictionary 하위 타입도 받을 수 있도록 -> 구지 ? extends를 안해도 하위타입을 받을 수 있다.
    public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }




    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드

        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }

    public static void main(String[] args) {

        //문제 1) 메서드 레퍼런스로 DefaultDictionary::new 를 받는 SpellChecker 생성자를 만들어라
        SpellChecker spellChecker1 = new SpellChecker(DefaultDictionary::new);
        SpellChecker spellChecker2 = new SpellChecker(DictionaryFactory2::get);



    }


}
