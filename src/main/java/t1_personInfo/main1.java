// To Ny Gian
package t1_personInfo;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = input.nextLine();
        System.out.println("Please enter your gender | M / F |: ");
        String sex = input.nextLine();
        System.out.println("Please enter your age: ");
        String age = input.nextLine();
        System.out.println("Please enter your nationality");
        String nation = input.nextLine();
        System.out.printf("%-9s: %s %n","Name",name);
        System.out.printf("%-8s: %s %n","Gender",sex);
        System.out.printf("%-9s: %s %n","Age",age);
        System.out.printf("%-9s: %s %n","Nationality",nation);

    }
}
