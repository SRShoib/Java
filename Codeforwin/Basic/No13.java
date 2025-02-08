package Basic;

import java.util.Scanner;

public class No13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two angles of a triangle: ");
        a = sc.nextInt(); b = sc.nextInt();

        System.out.println("Third angle of the triangle = " + (180 - (a + b)));
    }
}
