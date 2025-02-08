package Basic;

import java.util.Scanner;

public class No14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, height;
        System.out.print("Enter base and height of a triangle: ");
        base = sc.nextFloat();
        height = sc.nextFloat();

        System.out.printf("Area of the triangle = %.2f sq. units\n", (base * height) / 2f);
    }
}
