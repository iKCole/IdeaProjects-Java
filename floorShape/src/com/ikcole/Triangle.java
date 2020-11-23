package com.ikcole;

import java.util.Arrays;
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
        double[] read = new double[3];
        int i = 0;

        @Override
        Triangle StdinShape(Scanner input) {
            for (String display : Arrays.asList("Side A: ", "Side B: ", "Side C: ")) {
                System.out.print(display);
                read[i] = input.nextDouble();
                i += 1;
            }
            return new Triangle(read[0], read[1], read[2]);
        }
    }
}
