package Basic;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, width;

        System.out.print("Enter length of the rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextFloat();

        System.out.printf("Perimeter of the rectangle = %.2f units\n", 2 * (length + width));
    }
}
