package com.ikcole;
import java.util.Scanner;

class Shape {
    abstract static class ShapeInput<T extends Shape> {
        abstract T StdinShape(Scanner scanner);
    }

    double calculateArea() {
        return 0;
    }
}
