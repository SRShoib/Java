package Basic;

import java.util.Scanner;

public class No11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, expo;
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        expo = sc.nextDouble();

        System.out.printf("%.2f ^ %.2f = %.2f\n", base, expo, Math.pow(base, expo));
    }
}
