package Array;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n], arr2 = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        System.out.print("Elements of source array are : ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        System.out.print("Elements of dest array are : ");
        for (int i : arr2)
            System.out.print(i + " ");
        System.out.println();
    }
}
