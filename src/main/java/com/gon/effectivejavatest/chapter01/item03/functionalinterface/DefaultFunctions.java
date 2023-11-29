package com.gon.effectivejavatest.chapter01.item03.functionalinterface;


import com.gon.effectivejavatest.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {

        // int -> string
        Function<Integer, String> intToString = Object::toString;

        // () -> 리턴값
        Supplier<Person> personSupplier = Person::new;//기본생성자
        Function<LocalDate, Person> personFunction = Person::new;

        // Integer -> ()
        Consumer<Integer> integerConsumer = System.out::println;

        // Person -> boolean
        Predicate<Person> predicate;


    }
}
