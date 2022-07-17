package com.learnJava.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW i3", 113, 89000));
        cars.add(new Car("AUDI Q7", 170, 95000));
        cars.add(new Car("Honda city", 26, 55000));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ron", "B", 89));
        students.add(new Student("Qazi", "C", 95));
        students.add(new Student("Fiona", "A", 55));

   //     Collections.sort(cars); // we just need to provide logic in compare() on cars class for this algo to work
        // based on that it will compare.
        Collections.sort(cars, (c1,c2)->c1.getPrice()>c2.getPrice()?1:-1);
        /*now to implement comparable , we need to implement comparable interface from our class Car.*/

        for (Car c : cars) {
            System.out.println(c);
        }
//for Student Object --> comparator

      /*  You can make the sort() for your own classes work if
      you implement Comparator interface, whether you have implemented Comparable or not.*/

//        Comparator<Student> com = new Comparator<Student>() { // we use anonymous in a class to instantiate this interface
//
//            /*or comparator is a functional interface so one can use lambda as well*/
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.getMarks() > s2.getMarks()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//
//        };


        Collections.sort(students, (s1,s2)->s1.getMarks()>s2.getMarks()?1:-1);

        for(Student s: students){
            System.out.println(s);
        }

    }
}


/* comparator used in two situation:
* 1) what if the class u got donot implements comparable interface
* 2)u get the glass from 3rd party lib so u cant change the src code*/
