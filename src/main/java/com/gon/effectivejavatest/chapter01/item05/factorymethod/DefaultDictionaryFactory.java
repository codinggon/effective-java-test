package com.gon.effectivejavatest.chapter01.item05.factorymethod;

import com.gon.effectivejavatest.chapter01.item05.DefaultDictionary;
import com.gon.effectivejavatest.chapter01.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
