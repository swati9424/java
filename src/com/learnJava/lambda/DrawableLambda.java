package com.learnJava.lambda;


@FunctionalInterface  //It is optional
interface Drawable{
    public void draw();
}
public class DrawableLambda {
    public static void main(String[] args) {
        int width = 10;

        Drawable drawableLambda = () -> System.out.println("Drawing" +width);
        drawableLambda.draw();
    }
}
