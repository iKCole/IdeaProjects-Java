package com.ikcole;

import java.util.Scanner;

public class Triangle extends Shape {
    protected double a;
    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static class TriangleStdin extends ShapeInput<Triangle> {
        @Override
        Triangle StdinShape(Scanner input) {
            return new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}
