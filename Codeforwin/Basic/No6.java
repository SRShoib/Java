package Basic;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r;
        System.out.print("Enter radius of a circle: ");
        r = sc.nextFloat();

        System.out.printf("Diameter of the circle = %.2f units\n", 2 * r);
        System.out.printf("Circumference of the circle = %.2f units\n", 2 * Math.PI * r);
        System.out.printf("Area of the circle = %.2f sq. units\n", Math.PI * r * r);
    }
}
