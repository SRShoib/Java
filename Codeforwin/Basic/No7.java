package Basic;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n;

        System.out.print("Enter length in centimeter: ");
        n = sc.nextFloat();

        System.out.printf("Length in Meter = %.2f m\n", n / 100f);
        System.out.printf("Length in Kilometer = %.2f km\n", n / 100000f);
    }
}
