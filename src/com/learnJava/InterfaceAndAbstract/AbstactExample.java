package com.learnJava.InterfaceAndAbstract;



abstract class Abc{
    // if i do not give abstact method in abstract class still it is fine
}

class Parent{
    String familyName;

    public Parent(final String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(final String familyName) {
        this.familyName = familyName;
    }
}

class Child extends Parent{

    String childName;
    public Child(final String familyName,final String childName) {
        super(familyName); // should be the first statment inside the constructor
       this.childName=childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(final String childName) {
        this.childName = childName;
    }
}
public class AbstactExample {
    public static void main(String[] args) {
        Parent parent = new Child("Acharya","Swati");

        // how many object are created ??
        // only one bject is created ,, constructor i sjust to initilize the members
    }
}