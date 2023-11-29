package com.gon.effectivejavatest.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    LocalDate birthday;

    public Person() {

    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));

        //java 8 이전에 사용하는 방법
        //compareTo
        // a == b  : 0 반환  (자리 유지)
        // / a > b : 1 반환  (자리 바꿈)
        // / a < b : -1 반환  (자리 유지)

        //문제 1) 내림차순으로 sort를 사용해서 설정하고 더블콜론(메소드 레퍼런스)를 사용해서 간략하게 호출 -> birthday 비교

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {

                //오름차순 정렬
                return a.birthday.compareTo(b.birthday);

                //내림차순 정렬
//                return b.birthday.compareTo(a.birthday);
            }
        });

        people.sort(Person::compareByAge);

    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

}
