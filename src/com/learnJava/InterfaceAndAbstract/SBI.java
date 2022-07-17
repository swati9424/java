package com.learnJava.InterfaceAndAbstract;

public class SBI implements RBI {

    public void withdraw() {
        System.out.println("SBI withdraw");

    }

    public void deposit() {
        System.out.println("SBI deposit");
    }


    public void linkAdhar() {
        System.out.println("adhar linked"); // must have a body.
        //logic
    }
}
