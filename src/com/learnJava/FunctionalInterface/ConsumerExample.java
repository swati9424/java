package com.learnJava.FunctionalInterface;

import com.learnJava.data1.Student;
import com.learnJava.data1.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

  /* Consumer : performs operation accepting single argument and returns no result
   Bi-consumer : does the same as above but with two argument */

public class ConsumerExample {


    static Consumer<Student> c2 = (student)-> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printStudentsName() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public  static void printNameAndActivities(){
        System.out.println("printNameAndActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); // this called consumer chaining

    }

    public  static void printNameAndActivitiesUsingConditions(){
        System.out.println("printNameAndActivitiesUsingConditions");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=4){
                c3.andThen(c4).accept(student);  // can do chaining upto nth consumer instance using 'andThen'
                                                // and doesnt return the result
            }
        }));

    }
    public static void main(String[] args) {

        //left side is functional interface and on thr RHS is the lambda function. i.e functional interface holds lambda function.
        Consumer<String> c1 = (s -> System.out.println(s.toUpperCase()));
        c1.accept("java8"); // accept: method used for consumer and biconsumer

        //next code snippet
       // printStudentsName();
        printNameAndActivities();
        printNameAndActivitiesUsingConditions();
    }
}
