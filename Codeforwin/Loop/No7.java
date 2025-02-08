package Loop;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        System.out.print("Enter upper limit: ");
        n = sc.nextInt();

        for (int i=2; i<=n; i+=2)
            sum += i;
        System.out.println("Sum of all even number between 1 to  " + n + " = " + sum);
    }
}
