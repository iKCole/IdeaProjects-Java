package com.ikcole;

import java.util.Arrays;
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
        double[] scan = new double[2];
        int i = 0;

        @Override
        Rectangle StdinShape(Scanner scanner) {
            for (String display : Arrays.asList("Height: ", "Width: ")) {
                System.out.print(display);
                scan[i] = scanner.nextDouble();
                i = i + 1;
            }
            return new Rectangle(scan[0],scan[1]);
        }
    }
}
