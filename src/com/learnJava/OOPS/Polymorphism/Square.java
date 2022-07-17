package com.learnJava.OOPS.Polymorphism;

public class Square extends Shape{

     Square(final double side) {
        super(side);
    }


    /* this will run when object of Square is created,
     * hence its overriding the parent method.*/
    @Override
    void area() {
        System.out.println("Area of square is " + side * side);
    }
}
