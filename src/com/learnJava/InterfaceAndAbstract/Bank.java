package com.learnJava.InterfaceAndAbstract;

public class Bank {
    public static void main(String[] args) {
        RBI sbi = new SBI();
        sbi.deposit();
        sbi.withdraw();
        sbi.linkAdhar();

        RBI pnb = new PNB();
        pnb.withdraw();
        pnb.deposit();
        pnb.linkAdhar(); // even though its not overidden in PNB class, it will call its parent class i.e Interface method
    }
}
