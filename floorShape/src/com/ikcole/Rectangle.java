package com.ikcole;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    static class RectangleStdin extends ShapeInput<Rectangle> {
        @Override
        Rectangle StdinShape(Scanner scanner) {
            return new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        }
    }
}
