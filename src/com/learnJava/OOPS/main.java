package com.learnJava.OOPS;

public class main {
    public static void main(String[] args) {

        Student swa = new Student();

        System.out.println("Hi I am " + swa.name);
        System.out.println("my roll number is " + swa.rno);
        System.out.println("i got " + swa.marks + " marks.");
        System.out.println("have a good day !!");


        //or pass the values here and this from default constructor will take this up

        Student s = new Student(22,"frank",99.8f);
        System.out.println(s.name);
    }
}
