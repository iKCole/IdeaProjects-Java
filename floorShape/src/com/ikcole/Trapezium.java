package com.ikcole;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Trapezium extends Shape {
    private double height;
    private double baseX;
    private double baseY;

    public Trapezium(double h, double x, double y) {
        height = h;
        baseX = x;
        baseY = y;
    }

    @Override
    public double calculateArea() {
        return ((baseX + baseY) * 2) / 2;
    }

    static class TrapeziumStdin extends ShapeInput<Trapezium> {
        @Override
        Trapezium StdinShape(Scanner scanner) {
            return new Trapezium(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        }
    }
}
