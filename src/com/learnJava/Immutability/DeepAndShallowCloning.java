package com.learnJava.Immutability;

public class DeepAndShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address empAddress = new Address("CR01HB","Surrey");
        Employee emp1 = new Employee(1,"Swa","swa@gmail.com",empAddress);
        Employee emp2 = (Employee) emp1.clone(); // this is called shallow cloning. by default java supports shallow cloning.

        emp2.getAddress().setPostcode("CR05UA"); // changing reference var independently due to deep cloning
        System.out.println("employee 1 is" + emp1);
        System.out.println("employee 2 is" + emp2);
    }
}
