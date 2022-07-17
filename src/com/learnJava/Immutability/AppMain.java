package com.learnJava.Immutability;

public class AppMain {
    public static void main(String[] args) {
        Address traineeAddress = new Address("CR01HB","Surrey");
        Trainee trainee = new Trainee(1,"Swati",traineeAddress);
        System.out.println(trainee);

        Address address = trainee.getAddress(); // here we can see its directly fetching the address as Address is a mutable class
        address.setPostcode("CR05UA"); // so its able to set address to different address which is a bug to immuatbility concept,
        address.setState("VFX");// to protect it, we need to create a cloned copy of Address object in the Address class */check trainee.java getAdress()
        System.out.println(trainee);

        //we can check the above explaination by generating hashcode for the two addresses,
        // it will have different hashcode which confirms its a different object created with new address in getAddress().
    }


}
