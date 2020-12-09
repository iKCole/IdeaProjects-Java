package com.ikcole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {
        private static final String COMMA_DELIMITER = ",";
        Scanner scanner = null;
        public Util() {

        }
        public void readCVS() {
            try {
                scanner = new Scanner(new File("~/Users/isaaccoleman/IdeaProjects/AmazonShopping/out/production" +
                        "/AmazonShopping/com/ikcole/file.csv"));
                scanner.useDelimiter(COMMA_DELIMITER);
                while(scanner.hasNext()) {
                    System.out.print(scanner.next() +" ");
                }
            } catch (FileNotFoundException fe) {
                fe.printStackTrace();
            }
            finally {
                scanner.close();
            }
        }
}
