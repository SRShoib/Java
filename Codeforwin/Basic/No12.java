package Basic;

import java.util.Scanner;

public class No12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n;
        System.out.print("Enter any number to find square root: ");
        n = sc.nextDouble();

        System.out.printf("Square root of %.2f = %.2f\n",n, Math.sqrt(n));
    }
}
