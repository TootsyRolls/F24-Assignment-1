// To Ny Gian
package t2_pythagoreanBrute;

public class main2 {
    public static void main(String[] args) {
        System.out.printf("%-3s %-3s %-3s\n","A:","B:","C:");

        for (int a = 2; a <= 500; a++) {
            for (int b = 2; b <= 500; b++) {
                for (int c = 2; c <= 500; c++) {
                    if (a*a + b*b == c*c) {
                        System.out.printf("%-3d %-3d %-3d\n",a,b,c);
                    }
                }
            }
        }
    }
}
