package com.ikcole;
import java.text.DecimalFormat;
import java.util.Scanner;

class Shape {
    abstract static class ShapeInput<T extends Shape> {
        abstract T StdinShape(Scanner scanner);
    }

    double calculateArea() {
        return 0;
    }

    public static String doubleFormat(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }
}
