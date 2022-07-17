package com.learnJava.lambda;

@FunctionalInterface // is optional
interface Addable{
   int add(Integer a, Integer b);
}

@FunctionalInterface
interface Square{
    int square(Integer n);
}
public class AddableLambda {
    static Addable ad1 = (a, b)->(a+b);  // two arguments , parenthesis is mandatory
    static Addable ad2 = (Integer a, Integer b)->(a+b); // could be written with data types or without as above
    static Square sq1 = n -> n*n; // for one arg, paranthesis is non mandatory(optional).
    static Square sq2 = n -> {return n*n;}; // without curly braces we cant use return keyword. compiler will consider returned value automatically
                          // also if within curly braces we want to return some value we must use return statement.
    public static void main(String[] args) {
        System.out.println("the result of 1 is:" + ad1.add(10,20));
        // OR could be done like follows:
        System.out.println(ad2.add(200,300));
        System.out.println(sq1.square(4));
        System.out.println(sq2.square(5));
    }
}
