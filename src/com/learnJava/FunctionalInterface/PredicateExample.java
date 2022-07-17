package com.learnJava.FunctionalInterface;

import java.util.function.Predicate;


// * Predicate: represents a predicate (boolean-valued function) of one argument. // return type: boolean
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (i)-> i%2==0;
        System.out.println(p1.test(4)); // test: method used for predicate
    }
}
