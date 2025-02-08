package Loop;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Print all even number till: ");
        n = sc.nextInt();

        System.out.println("Even number from 1 to " + n + " are:");
        for (int i=1; i<=n; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }
}
