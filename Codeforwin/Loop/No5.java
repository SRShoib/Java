package Loop;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Print all odd number till: ");
        n = sc.nextInt();

        System.out.println("Odd number from 1 to " + n + " are:");
        for (int i=1; i<=n; i++)
            if (i % 2 == 1)
                System.out.println(i);
    }
}
