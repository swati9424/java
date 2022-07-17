package com.learnJava.FunctionalInterface;

import java.util.Arrays;
import java.util.function.Supplier;

import com.learnJava.data1.Student;

public class SupplierExample {

    /* supplier: opp to consumer, doesnt take any input but returns an o/p with get() */

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () ->{  //empty input
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        System.out.println("the student is:" + studentSupplier.get()); //returns output(in this case student info)
    }
}
