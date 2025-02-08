package Basic;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, width;

        System.out.print("Enter length of the rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextFloat();

        System.out.printf("Are of the rectangle = %.2f sq. units\n", (length * width));
    }
}
