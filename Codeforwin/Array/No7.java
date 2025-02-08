package Array;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0)
                count++;
        }
        System.out.println("Total negative elements in array is = " + count);
    }
}
