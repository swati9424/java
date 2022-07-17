package com.learnJava.OOPS.Polymorphism;

public class NumberOverloading {

    //same name, diff type/return/order

    double sum(int a, int b){
        return a+b;
    }

    double sum(double a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        NumberOverloading nums = new NumberOverloading();
        nums.sum(1,2,3);
        System.out.println("the sum is " + nums.sum(1,2));
   //     nums.sum(1,2,3,4) //uncomment to see this will give compile time error so its called static/compile time polymorphism.

    }
}
