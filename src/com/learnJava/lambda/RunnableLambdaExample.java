package com.learnJava.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {

      /*  prior to JAVA 8*/

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable instance 1");
            }
        };
         new Thread(runnable).start();

         //with lambda, as folllows:

         Runnable runnableLambda1 = () -> {
             System.out.println("inside runnable lambda 3");

         }; // can rewrite it in single statement too without curly braces.. in the event where more than one statement is mentioned,
            // its a must to specify curly braces

        new Thread(runnableLambda1).start();

         //OR can be written like below
        new Thread(()-> System.out.println("inside runnable 4")).start(); // dont need curly braces for single statements in lambda
    }
}
