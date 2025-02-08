package Ifelse;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter three integer number: ");
        a = sc.nextInt(); b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Maximum is = " + Math.max(Math.max(a, b), c));
    }
}
