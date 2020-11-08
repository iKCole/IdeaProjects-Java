import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String[] groupOfArmy = {"no army", "pack", "throng", "zounds", "legion"};
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if (input >= 1000) {
            System.out.println(groupOfArmy[4]);
        } else if (input >= 250 && input <= 999) {
            System.out.println(groupOfArmy[3]);
        } else if (input >= 20 && input <= 249) {
            System.out.println(groupOfArmy[2]);
        } else if (input >= 1 && input <= 19) {
            System.out.println(groupOfArmy[1]);
        } else {
            System.out.println(groupOfArmy[0]);
        }
    }
}