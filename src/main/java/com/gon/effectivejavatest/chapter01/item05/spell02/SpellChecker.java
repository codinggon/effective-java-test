package com.gon.effectivejavatest.chapter01.item05.spell02;

import com.gon.effectivejavatest.chapter01.item05.Dictionary;
import com.gon.effectivejavatest.chapter01.item05.factorymethod.DictionaryFactory;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    //팩토리 메서드 패턴 -> factory를 interface로
    //문제 1) Dictionary 와 관련된 factory를 만들어서 어떤 하위 클래스가 와도 해당 spellchecker 클래스에 변경이 없도록 구현하라
    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
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
        SpellChecker spellChecker = new SpellChecker(new MockDictionaryFactory());


    }

}
