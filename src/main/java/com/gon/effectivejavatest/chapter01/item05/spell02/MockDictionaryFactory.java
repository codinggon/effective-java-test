package com.gon.effectivejavatest.chapter01.item05.spell02;

import com.gon.effectivejavatest.chapter01.item05.Dictionary;
import com.gon.effectivejavatest.chapter01.item05.MockDictionary;
import com.gon.effectivejavatest.chapter01.item05.factorymethod.DictionaryFactory;

public class MockDictionaryFactory implements DictionaryFactory {


    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
