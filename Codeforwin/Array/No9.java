package Array;

import java.util.*;

class GFG {

    public static int[] insertX(int n, int[] arr,
                                int x, int pos) {
        int i;
        int[] newarr = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
}
public class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements:");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter element to insert : ");
        int num = sc.nextInt();
        System.out.print("Enter the element position : ");
        int pos = sc.nextInt();
        System.out.print("Elements of array are: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        arr = GFG.insertX(n, arr, num, pos);
        System.out.print("Array elements after insertion : ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

    }
}
