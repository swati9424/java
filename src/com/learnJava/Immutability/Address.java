package com.learnJava.Immutability;

public class Address implements Cloneable{

    private String postcode;
    private String State;
    private String county;

    public Address(final String postcode, final String state) {
        this.postcode = postcode;
        State = state;
    }

    public Address(Address address) {
        this(address.getPostcode(), address.getState());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(final String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
