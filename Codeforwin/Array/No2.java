package Array;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print("All negative elements of array are: ");
        for (int i : arr){
            if (i < 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
