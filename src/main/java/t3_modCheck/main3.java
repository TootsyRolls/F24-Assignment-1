// To Ny Gian
package t3_modCheck;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and a base, seperated by a space: ");
        String nums = input.nextLine();

        String[] split = nums.split(" ");
        int num = Integer.parseInt(split[0]);
        int base = Integer.parseInt(split[1]);

        System.out.println("Enter an English letter: ");
        char letter = input.next().charAt(0);
        int letterNum = letterToNum(letter);

        input.nextLine(); //Clears line

        System.out.println("Enter a number base and an English letter base, separated by a space: ");

        int base2 = input.nextInt();
        char letterBase = input.next().charAt(0);
        int letterBaseNum = letterBaseToNum(letterBase);

        // Num divisible by Base?
        if (isNumDivBase(num, base)) {
            System.out.println(num+" is divisible by "+base);
        }
        else {
            System.out.println(num+" is not divisible by "+base);
        }

        // Letter divisible by Base2?
        if (isCharDivBase2(letterNum, base2)) {
            System.out.println(letter+" is divisible by "+base2);
        }
        else {
            System.out.println(letter+" is not divisible by "+base2);
        }

        // Letter divisible by LetterBase?
        if (isCharDivLetterBase(letterNum, letterBaseNum)) {
            System.out.println(letter+" is divisible by "+letterBase);
        }
        else {
            System.out.println(letter+" is not divisible by "+letterBase);
        }

    }

    public static boolean isNumDivBase(int num, int base) {
        return num % base == 0;
    }

    /* ascii of A = 65
       A - A = 0
       B - A = 1
       so on until
       Z - A = 25
     */
    public static int letterToNum (char letter) {
        return Character.toUpperCase(letter) - 'A';
    }
    public static int letterBaseToNum (char letterBase) {
        return Character.toUpperCase(letterBase) - 'A';
    }

    public static boolean isCharDivBase2(int letterNum, int base2) {
        return letterNum % base2 == 0;
    }

    public static boolean isCharDivLetterBase(int letterNum, int letterBaseNum) {
        return letterNum % letterBaseNum == 0;
    }

}
