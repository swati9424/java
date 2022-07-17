package com.learnJava.Array;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // if we declare the list as final , we can modify the list as below
       final List<String> list = new ArrayList<>();

        list.add("Swati");
        list.add("Rohit");

        System.out.println(list);

        //however you can reassign the list as below
       // list = new ArrayList<>(); // uncomment to see the error
    }
}
