package com.learnJava.EqualsAndHash;

public class ExampleMain {

    public static void main(String[] args) {
        Human human = new Human(1,"Rohit");
        Human human2 = new Human(2,"Swati");

        // we are able to call this hashcode method directly because every class in java extends the object class
        //internally and object class have 11 methods , two of which are hashcode and equals(), so we can even override them.
        // to note here, if we scroll to the below called method i.e hashcode(); we can see its being declared in Object.java
        // but we see there's no implementation becoz its a native method and java native method area mostly written in c,c++.
        //(native) --> impl is already written in other lang, no need to rewrite it.
        //hascode returns int.
        final int swatiHashcode = human2.hashCode();
        System.out.println("swati's hashcode is:" + swatiHashcode);

        final int rohitHashcode = human.hashCode();
        System.out.println("rohit's hashcode is:" + rohitHashcode);

        // during creation of object, each object created sits in heap and is assigned a memory address(in java we cant see address)
        //with the help of this unique address , hashcode() is calculated for each object.
    }
}
