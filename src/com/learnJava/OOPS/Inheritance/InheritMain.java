package com.learnJava.OOPS.Inheritance;

import com.learnJava.OOPS.Inheritance.InheritBox;
import com.learnJava.OOPS.Inheritance.InheritBoxWeight;

public class InheritMain {
    public static void main(String[] args) {

        InheritBox box1 = new InheritBox();  // called the first constructor
        System.out.println("lenght is " + box1.l + " breadth is " + box1.w + " height is " +box1.h);

        InheritBox box2 = new InheritBox(2);  // called the 2nd constructor
        System.out.println("lenght is " + box2.l + " breadth is " + box2.w + " height is " +box2.h);

        InheritBox box3 = new InheritBox();  // called the 4th constructor
        InheritBox box4 = box3;
        System.out.println("lenght is " + box4.l + " breadth is " + box4.w + " height is " +box4.h);

        InheritBoxWeight boxNew = new InheritBoxWeight(2,-1,3,33);
        System.out.println("lenght is " + boxNew.l + " breadth is " + boxNew.w + " height is " +boxNew.h + " weight is " + boxNew.weight);
    }
}
