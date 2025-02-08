package Loop;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        System.out.print("Enter upper limit: ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++)
            sum += i;
        System.out.println("Sum of first " + n + " natural number = " + sum);
    }
}
