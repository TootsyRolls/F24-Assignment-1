// To Ny Gian
package t2_caseConv;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Please choose the case you want to convert:\n1. 'l' or 'L' for lowercase\n2. 'u' or 'U' for uppercase\n3. 't' or 'T' for titlecase");
        char choice = input.next().charAt(0);

        System.out.printf("%-39s: %s\n","Original word",word);
        System.out.printf("%-39s: %s\n","Calling the first toTitleCase method",toTitleCase(word));
        System.out.printf("%-39s: %s\n","Calling the second convertChoice method",convertChoice(word,choice));

    }
    public static String toTitleCase(String word){
        String sub1 = word.substring(0, 1).toUpperCase();
        String sub2 = word.substring(1).toLowerCase();
        return sub1 + sub2;
    }

    public static String convertChoice(String word, char choice){
        return switch (choice) {
            case 'l', 'L' -> word.toLowerCase();
            case 'u', 'U' -> word.toUpperCase();
            case 't', 'T' -> toTitleCase(word);
            default -> "Kaput";
        };
    }
}
