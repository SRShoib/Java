package Loop;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter any number: ");
        n = sc.nextInt();
        System.out.print("Natural numbers from 1 to " + n);

        for (int i = 1; i<=n; i++)
            System.out.println(i);
    }
}
