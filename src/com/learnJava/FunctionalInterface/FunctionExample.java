package com.learnJava.FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

    //function interface: function accepts an argument and returns result(of any type)
    //unary operator: use cases where input and output is of same type we need not use func we can use unary operators
    //binary operator: acts on two input and produces one output , i/p and o/p should be of same type

    static Function<String,String> function = String::toUpperCase; //using method reference
    static Function<String,String> addSomeString = (name)-> name.toUpperCase().concat("functionalities");

    public static void main(String[] args) {

        System.out.println("the result of 1 is:" + function.apply("java8")); // method usd for function interface is apply

        System.out.println("the result of 2 is:" + function.andThen(addSomeString).apply("java8")); //and then performs the function in the way its given..
                                                                                        //i.e first uppercase of name and then concatenates the other string
        System.out.println("the result of 3 is:" + function.compose(addSomeString).apply("java8")); //performs operation on the compose first then goes to prev func.
    }
}
