package com.learnJava.InterfaceAndAbstract;

public interface RBI {
        //all methods in an interface is by default public and abstract.
       // we also need to make sure that the below methods are overidden in its implementing class
    /**/
        void withdraw();
        void deposit();

    /* from java 1.8, we can include default methods in an interface and the implementing class dont have
     * to override them.*/
    public default void linkAdhar(){ //public defualt method
        System.out.println("link adhar to your bank");
    }

    }

