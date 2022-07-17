package com.learnJava.Immutability;

public class Employee implements Cloneable {

    private int empId;
    private String empName;
    private String email;
    private Address address;

    public Employee(final int empId, final String empName, final String email, final Address address) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { //performing deep cloning
         Employee emp = (Employee) super.clone();
         emp.setAddress((Address) address.clone());
         return emp;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
