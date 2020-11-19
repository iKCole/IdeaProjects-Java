package com.ikcole;

public class Circle extends Shape {
    protected final double PI = Math.PI;
    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
