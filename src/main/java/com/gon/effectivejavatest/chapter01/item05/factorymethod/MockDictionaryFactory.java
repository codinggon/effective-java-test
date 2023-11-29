package com.gon.effectivejavatest.chapter01.item05.factorymethod;

import com.gon.effectivejavatest.chapter01.item05.Dictionary;
import com.gon.effectivejavatest.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
