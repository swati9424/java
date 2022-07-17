package com.learnJava.FunctionalInterface;


import com.learnJava.data1.Student;
import com.learnJava.data1.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public  static void printNameAndActivitiesWithBiconsumer(){
        System.out.println("printNameAndActivitiesWithBiconsumer");
        BiConsumer<String,List<String>> biConsumer = (name,activities)-> System.out.println(name + " : "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student)->biConsumer.accept(student.getName(),student.getActivities())); //doesnot return any result.. just accepts two args

    }
    public static void main(String[] args) {
        printNameAndActivitiesWithBiconsumer();
    }
}
