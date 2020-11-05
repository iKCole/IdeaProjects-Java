package com.ikcole;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    String[] guestNames = new String[10];

        int i = 0;
        while (i < 10) {
            guestNames[i] = scan.next();
            i++;
        }

        for (i = 9; i >= 0; i--) {
            System.out.println(guestNames[i]);
        }

        // Another way
        System.out.println("-----------------");
        List<String> guestNames1 = Arrays.asList(guestNames);

        Collections.reverse(guestNames1);
        guestNames1.forEach(System.out::println);
    }
}
