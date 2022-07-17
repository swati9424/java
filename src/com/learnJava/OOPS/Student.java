package com.learnJava.OOPS;

public class Student {

     int rno;
     String name;
     Float marks;

    //this is a constructor with 0 args.

    public Student() {
        /* this is how you call a constructor from another constructor
        * internally its new Student(13,"swa","87.88");*/
        this(13,"swati",87.88f);
    }

    //this is a default constructor with args. to initialize objects of a class

    public Student(final int rno, final String name, final Float marks) {
        this.rno = rno; //this --> refers to current object in this case whatever u pass in main.java Student object
        this.name = name;
        this.marks = marks;
    }
}
