import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shape = scan.next().toLowerCase();

        switch (shape) {
            case "triangle":
                double[] lengthT = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
                System.out.println(areaTriangle(lengthT[0], lengthT[1], lengthT[2]));
                break;
            case "rectangle":
                double[] lengthR = {scan.nextDouble(), scan.nextDouble()};
                System.out.println(areaRec(lengthR[0], lengthR[1]));
                break;
            case "circle":
                double r = scan.nextDouble();
                System.out.println(areaCircle(r));
                break;
            default:
                System.out.println("Error: Invalid Input");
                break;
        }
    }
    // Method for calculating the area of Triangle using a heron's formula
    static double areaTriangle(double a, double b, double c) {
        // Calculate all the lengths of sides divided by 2
        double calcuLength = (a + b + c) / 2;
        // Calculate the total first
        double calcArea = calcuLength * (calcuLength - a) * (calcuLength - b) * (calcuLength - c);
        // With the square root to get the area.
        return Math.sqrt(calcArea);
    }

    static double areaRec(double h, double w) {
        return h * w;
    }

    static  double areaCircle(double r) {
        return 3.14 * (r * r);
    }

}