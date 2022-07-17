package com.learnJava.OOPS.Polymorphism;

public class ShapeMain {
    public static void main(String[] args) {

        /*To note here:
        ***imp***
        WHAT needs to be accessed depends on base class but WHICH method to access depends on object type
         so as much as its important to have area() in base class(for access), which area will be called
         totally depends on the type of object created in main()*/

        Shape shape1 = new Circle(4,3.14);  //overriding happens at runtime
        Shape shape2 = new Rectangle(4,6);
        Shape shape3 = new Square(4);

        shape1.area();
        shape2.area();
        shape3.area();


    }
}
