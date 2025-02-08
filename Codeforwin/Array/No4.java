package Array;

import java.util.*;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Maximum element of array is: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Minimum element of array is: " + Arrays.stream(arr).min().getAsInt());
    }
}
