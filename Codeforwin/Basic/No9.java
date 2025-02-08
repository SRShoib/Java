package Basic;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float f;
        System.out.print("Enter temperature in Fahrenheit: ");
        f = sc.nextFloat();

        System.out.printf("%.2f Fahrenheit = %.2f Celsius",f, ((f - 32) * 5) / 9f);

    }
}
