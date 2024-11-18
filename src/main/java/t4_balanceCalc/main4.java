// To Ny Gian
package t4_balanceCalc;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your initial amount of capital: ");
        double capital = input.nextDouble();
        System.out.println("Enter the amount of interest (%): ");
        double interest = (input.nextDouble()/100)+1;
        System.out.println("Enter the amount of amount of saving years: ");
        int yr = input.nextInt();

        double interestF = capital*(Math.pow(interest,yr));
        System.out.printf("%-20s: %s\n","Initial Capital Amount",capital);
        System.out.printf("%-20s: %s\n","Amount Of Interest",interest);
        System.out.printf("%-20s:, %s\n","Amount Of Savings Years",yr);
        System.out.printf("%-20s, %s\n","Final Capital Amount",interestF);
    }
}
