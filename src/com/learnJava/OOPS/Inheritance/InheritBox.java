package com.learnJava.OOPS.Inheritance;


public class InheritBox {
    double l;
    double w;
    double h;

    public InheritBox() {
        this.l = -1;
        this.w = 2;
        this.h = 3.4;
    }

    public InheritBox(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public InheritBox(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    InheritBox(InheritBox old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
