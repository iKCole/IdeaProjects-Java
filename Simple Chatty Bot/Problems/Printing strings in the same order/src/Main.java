import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = new String[4];

        int i = 0;
        while (i < 4) {
            words[i] = input.next();
            i++;
        }

//        for (int j = 0; j < words.length; j++) {
//            System.out.println(words[j]);
//        }
        for (String word:
             words) {
            System.out.println(word);
        }
    }
}