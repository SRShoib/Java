package Ifelse;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two integer number: ");
        a = sc.nextInt(); b = sc.nextInt();

        System.out.println("Maximum is = " + Math.max(a, b));
    }
}
