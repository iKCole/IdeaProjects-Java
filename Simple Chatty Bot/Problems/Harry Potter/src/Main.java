import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String lookUp = scan.next().toLowerCase();
        switch (lookUp) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("Not a valid house");
                break;
        }
    }
}