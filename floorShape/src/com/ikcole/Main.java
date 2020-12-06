package com.ikcole;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        switch (parseString(displayTitle())) {
            case 1 -> {
                Circle c = new Circle.CircleStdin().StdinShape(sc);
                System.out.println(doubleFormat(c.calculateArea()) + " cm");
            }
            case 2 -> {
                Triangle t = new Triangle.TriangleStdin().StdinShape(sc);
                System.out.println(doubleFormat(t.calculateArea()));
            }
            case 3 -> {
                Rectangle r = new Rectangle.RectangleStdin().StdinShape(sc);
                System.out.println(Shape.displayInString(r.calculateArea()));
            }
            case 4 -> {
                Trapezium tz = new Trapezium.TrapeziumStdin().StdinShape(sc);
                System.out.println(doubleFormat(tz.calculateArea()));
            }
            default -> System.out.println("Error: Not within a selection!");
        }

    }

    public static String displayTitle() {
        System.out.print("*** Area Shape Calculation ***\n1.Circle\n2.Triangle\n3.Rectangle\n4.Trapezium\nPlease choose a number: ");
        return sc.next();
    }

    public static int parseString(String selector) {
        return Integer.parseInt(selector);
    }

    public static String doubleFormat(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }
}
