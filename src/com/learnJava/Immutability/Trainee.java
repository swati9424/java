package com.learnJava.Immutability;
//to make the below class immutable, lets make it final.
final public class Trainee {

    final private int id;
    final private String tName;
    final Address address;

    public Trainee(final int id, final String tName, Address address) {
        this.id = id;
        this.tName = tName;
        this.address = address;
    }

    public int getId() { //if its final , cant generate setters.
        return id;
    }

    public String gettName() {
        return tName;
    }

    public Address getAddress() {
        return new Address(address.getPostcode(),address.getState()); //creating cloned copy so the address remains immutable.

        /* the prob with the above approach is that everytime a new field is added in Address, we have to make changes to all classes referencing Address
         which is not a good implementation technique so instead of using this cloned copy we can use copy constructor in Adress class
         and directly call that copied constructor  here in getAddress so remaining field remains intact.
         so we should use like below instead of above one */

       // return new Address(address);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                ", address=" + address +
                '}';
    }
}
