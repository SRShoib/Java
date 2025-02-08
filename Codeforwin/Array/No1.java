package Array;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Input array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array elements:");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Elements of array are: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
