package Array;

import java.util.*;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Largest element of the array is: " + Arrays.stream(arr).max().getAsInt());
        int max = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i] != Arrays.stream(arr).max().getAsInt()){
                if (arr[i] > max)
                    max = arr[i];
            }

        }
        System.out.println("Second largest element of the array is: " + max);
    }
}
