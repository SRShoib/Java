package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Sum of " +a+ " and " +b+ " = " + (a+b));
//        System.out.printf("Sum of %d and %d = %d \n", a, b, a+b);
    }
}
