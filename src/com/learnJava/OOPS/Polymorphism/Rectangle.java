package com.learnJava.OOPS.Polymorphism;

public class Rectangle extends Shape{

    public Rectangle(final int l, final int w) {
        super(l, w);
    }

    /* this will run when object of Rectangle is created,
     * hence its overriding the parent method.*/
    @Override
    void area() {
        System.out.println("the area of rectangle is " + l * w);
    }
}
