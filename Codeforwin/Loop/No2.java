package Loop;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter any number: ");
        n = sc.nextInt();
        System.out.println("Natural numbers from 1 to " + n);

        for (int i=n; i>=1; i--)
            System.out.println(i);
    }
}
