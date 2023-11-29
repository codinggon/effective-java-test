package com.gon.effectivejavatest.chapter01.item03.streamprac;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("gon1");
        names.add("gon2");
        names.add("gon3");
        names.add("gon4");

        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println("s = " + s);
        }

    }

}
