package Basic;

import java.util.Scanner;

public class No15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a;
        System.out.print("Enter side of an equilateral triangle: ");
        a = sc.nextFloat();

        System.out.printf("Area of the equilateral triangle = %.2f sq. units\n", (Math.sqrt(3) / 4f) * (a * a));
    }
}
