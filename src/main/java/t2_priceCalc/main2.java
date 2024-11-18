// To Ny Gian
package t2_priceCalc;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price of the purchase: ");
        double ogPrice = input.nextDouble();
        System.out.println("Please enter the discount amount in percentage: ");
        double discount = input.nextDouble();
        double disPrice = ogPrice*(1-(discount/100));
        double fedPrice = disPrice*0.05;
        double provPrice = disPrice*0.09975;
        double finPrice = disPrice*1.14975;

        System.out.printf("%-20s: %s$\n","Original Price",ogPrice);
        System.out.printf("%-20s: %s%%\n","Discount Percentage",discount);
        System.out.printf("%-20s: %s$\n","Discounted Price",disPrice);
        System.out.println("----------------------------\n");
        System.out.printf("%-20s: %.4s$\n","Federal Tax",fedPrice);
        System.out.printf("%-20s: %.4s$\n","Provincial Tax",provPrice);
        System.out.printf("%-20s: %.4s$\n","Final Price",finPrice);
    }
}
