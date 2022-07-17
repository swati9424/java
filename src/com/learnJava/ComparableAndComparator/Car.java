package com.learnJava.ComparableAndComparator;

public class Car implements Comparable<Car>{
    private String model;
    private int mileage;
    private int price;

    public Car(final String model, final int mileage, final int price) {
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(final int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car2) { /*two objects are here, one that is calling the compareTo method and other
                                    car2 that we are passing over here so we can carry out the comparisons */
//teh object is accessible with using 'this'
        //this>car2 --> return 1
        //this <car 2 --> return -1
        //this == car2 --> return 0


        if(this.getMileage()> car2.getMileage()){
            return -1;
        }
        else {
            return 1;
        }
//       return this.compareTo(car2);
    }
}
