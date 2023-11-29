package com.gon.effectivejavatest.chapter01.item05.dependencyinjection;

import com.gon.effectivejavatest.chapter01.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
