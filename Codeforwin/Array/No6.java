package Array;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, even = 0, odd = 0;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Total even elements: " + even);
        System.out.println("Total odd elements: " + odd);

    }
}
