// To Ny Gian
package t1_simpleCalc;

import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class main1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a formula: ");
        String form = input.nextLine();

        System.out.println("Enter two numbers separated by a space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, or /: ");
        char op = input.next().charAt(0);

        System.out.printf("%-25s : %.2f\n", "Calling the first method", calc1(num1, num2));
        System.out.printf("%-25s : %.2f\n", "Calling the second method", calc2(num1, num2, op));
        System.out.printf("%-25s : %.2f\n", "Calling the third method", calc3(form));

    }

    public static double calc1(double num1, double num2) {
        return num1 + num2;
    }

    public static double calc2(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static double calc3(String form) {
        String sub1 = form.substring(0,form.indexOf(" "));
        String sub2 = form.substring(form.indexOf(" ")+3,form.length());
        String subOp = form.substring(form.indexOf(" ")+1,form.indexOf(" ")+2);

        double subNum1 = Double.parseDouble(sub1);
        double subNum2 = Double.parseDouble(sub2);

        switch (subOp) {
            case "+":
                return subNum1 + subNum2;
            case "-":
                return subNum1 - subNum2;
            case "*":
                return subNum1 * subNum2;
            case "/":
                return subNum1 / subNum2;
            default:
                return 0;
        }
    }
}
