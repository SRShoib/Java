package Basic;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float c;
        System.out.print("Enter temperature in Celsius: ");
        c = sc.nextFloat();

        System.out.printf("%.2f Celsius = %.2f Fahrenheit\n",c, ((c*9) / 5f) + 32);
    }
}
