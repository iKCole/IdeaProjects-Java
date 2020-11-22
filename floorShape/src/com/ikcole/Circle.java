package com.ikcole;

import java.util.Scanner;

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

    static class CircleStdin extends ShapeInput<Circle> {
        @Override
        Circle StdinShape(Scanner scanner) {
            return new Circle(scanner.nextDouble());
        }
    }
}
