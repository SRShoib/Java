package Ifelse;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter any number: ");
        n = sc.nextInt();

        if (n > 0)
            System.out.println("Number is POSITIVE");
        else if (n < 0)
            System.out.println("Number is NEGATIVE");
        else
            System.out.println("Number is ZERO");
    }
}
