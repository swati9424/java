package com.learnJava.OOPS.Inheritance;

import com.learnJava.OOPS.Inheritance.InheritBox;

public class InheritBoxWeight extends InheritBox {
    double weight;

    public InheritBoxWeight(final double weight) {
        this.weight = weight;
    }


    // the below will inheri
    public InheritBoxWeight(final double l, final double w, final double h, final double weight) {
        super(l, w, h); //super keyword used to call the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;
    }

    /*know that child class can inherit from its super class only if its members are public and void , not private*/
}
