package com.learnJava.ComparableAndComparator;

public class Student {
    private String name;
    private String grade;
    private int marks;

    public Student(final String name, final String grade, final int marks) {
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(final String grade) {
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(final int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", marks=" + marks +
                '}';
    }
}
