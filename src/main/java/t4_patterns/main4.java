// To Ny Gian
package t4_patterns;

public class main4 {
    public static void main(String[] args) {
        char star = '*';

        for (int i = 0; i <= 10; i++) { //keeps count
            for (int j = 0; j <= i; j++) { //follows i as it increase
                System.out.print(star);
            }
            System.out.println();
        }
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { //follows i as it decreases
                System.out.print(star);
            }
            System.out.println();
        }

        //flipped normal function
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print(" "); //space
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(star); //star after
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
