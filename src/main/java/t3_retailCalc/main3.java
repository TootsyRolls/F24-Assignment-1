// To Ny Gian
package t3_retailCalc;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data = 6;
        double profit = 0;

        while (data != 0) {

            System.out.println("Enter the product number (1-5 or 0 to stop): ");
            data = input.nextInt();

            if (data == 0) {
                break;
            }

            System.out.println("Enter the quantity sold: ");
            int qty = input.nextInt();

            switch (data) {
                case 1:
                    profit += (qty * 2.98);
                    break;
                case 2:
                    profit += (qty * 4.50);
                    break;
                case 3:
                    profit += (qty * 9.98);
                    break;
                case 4:
                    profit += (qty * 4.49);
                    break;
                case 5:
                    profit += (qty * 6.87);
                    break;

            }
        }
        System.out.printf("\n%s %.2f","The total retail value of all product sold is:",profit);
    }
}
