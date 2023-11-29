package com.gon.effectivejavatest.chapter01.item05.spell02;

import com.gon.effectivejavatest.chapter01.item05.DefaultDictionary;
import com.gon.effectivejavatest.chapter01.item05.Dictionary;
import com.gon.effectivejavatest.chapter01.item05.factorymethod.DictionaryFactory;

public class DefaultDectionaryFactory implements DictionaryFactory {


    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
