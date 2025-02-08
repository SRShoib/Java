package Basic;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter any two integer number: ");
        a = sc.nextInt(); b = sc.nextInt();

        System.out.println("SUM = " + (a+b));
        System.out.println("DIFFERENCE = " + Math.abs(a-b));
        System.out.println("PRODUCT = " + (a*b));
        System.out.printf("QUOTIENT = %.2f\n", (a/(b*1f)));
        System.out.println("MODULUS = " + (a%b));
    }
}
