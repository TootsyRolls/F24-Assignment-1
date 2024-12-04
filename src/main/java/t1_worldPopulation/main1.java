// To Ny Gian
package t1_worldPopulation;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the world population: ");
        long ppl = inp.nextLong();

        System.out.println("Enter the annual population growth rate (in % value): ");
        float grwRate = inp.nextFloat()/100;

        for (int yr = 1; yr<=75; yr++){
            long newPpl = (long)(ppl*Math.pow(1+grwRate,yr));
            long yrChange = (long)(newPpl-ppl*Math.pow(1+grwRate,yr-1));
            System.out.printf("Year %-2s %15s %12s\n",yr,newPpl,yrChange);
        }
    }
}
