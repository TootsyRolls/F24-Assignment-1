// To Ny Gian
package t4_coinToss;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean on = true;
        int heads = 0;
        int tails = 0;

        while (on) {
            System.out.println("1. Flip a Coin");
            System.out.println("2. Exit");

            System.out.println("Choose an option (1/2): ");
            int option = input.nextInt();

            if (option == 1) {
                if (flip()) {
                    heads++;
                    System.out.println("Heads");
                    System.out.println("Heads: "+heads+", Tails: " +tails+"\n"+"---------------");
                }
                else {
                    tails++;
                    System.out.println("Tails");
                    System.out.println("Heads: "+heads+", Tails: " +tails+"\n"+"---------------");

                }
            }
            else {
                System.out.println("Goodbye");
                on = false;
            }

        }
    }

    public static boolean flip() {
        return Math.random() <= 0.5;
    }

}
