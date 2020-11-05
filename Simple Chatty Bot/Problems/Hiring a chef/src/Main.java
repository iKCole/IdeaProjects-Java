import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create a resizable array that collects data from input


        String[] data = new String[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = input.next();
        }
        List formCollect = Arrays.asList(data);

        System.out.println("The form for " + formCollect.get(0) + " is completed. " +
                "We will contact you if we need a chef that cooks " + formCollect.get(4) +
                " dishes.");
    }
}
