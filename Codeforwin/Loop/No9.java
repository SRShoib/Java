package Loop;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number to print table: ");
        n = sc.nextInt();

        for (int i=1; i<=10; i++)
            System.out.println(n + " * " + i + " = " + (n * i));
    }
}
