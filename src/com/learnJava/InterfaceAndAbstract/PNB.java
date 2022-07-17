package com.learnJava.InterfaceAndAbstract;

public class PNB implements RBI {

    @Override
    public void withdraw() {
        System.out.println("PNB withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("PNB deposit");
    }
}
