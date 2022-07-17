package com.learnJava.EqualsAndHash;

import java.util.HashMap;
import java.util.Map;

public class HashCollision {
    public static void main(String[] args) {

        String s1 = "FB";
        String s2 = "Ea";
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        Map<String,Integer> map = new HashMap<>();

        map.put(s1,1);
        map.put(s2,2);

    }
}
