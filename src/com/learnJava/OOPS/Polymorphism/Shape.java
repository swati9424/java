package com.learnJava.OOPS.Polymorphism;

public class Shape {

    int l;
    int w;
    double side;

    // below are example of method overloading.

    Shape(final double side) {
        this.side = side;
    }

    Shape(final int l, final int w) {
        this.l = l;
        this.w = w;
    }

    void area(){

        System.out.println("Hi I calculate area of class Shape");
    }

//   final void area(){ /* if we declare the method as final t cant be overriden coz compiler will now know and the java
//        compiler will copy the byte code from compile code as per internal implementation and since overiding happens at runtime
//        it will not let it happen for java provides performance enhancement*/
//
//
//        System.out.println("Hi I calculate area of class Shape");
//    }
}
