package com.learnJava.OOPS.Polymorphism;

public class Circle extends Shape{


    double pie;

     Circle(final double side, final double pie) {
        super(side);
        this.pie = pie;
    }
       /* this will run when object of Circle is created,
        * hence its overriding the parent method.*/
    @Override
    void area() {
        double result = side * side * pie;
        System.out.println("area of circle is " + result);
    }
}
