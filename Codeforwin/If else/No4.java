package Ifelse;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter any number: ");
        n = sc.nextInt();

        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Number is divisible by 5 and 11");
        else
            System.out.println("Number is not divisible by 5 and 11");
    }
}
