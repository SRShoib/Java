package Basic;

import java.util.Scanner;

public class No18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float principle, time, rate;

        System.out.print("Enter principle (amount): ");
        principle = sc.nextFloat();
        System.out.print("Enter time: ");
        time = sc.nextFloat();
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();

        System.out.printf("Compound Interest = %.2f\n", principle * (Math.pow((1 + (rate / 100f)), time)));
    }
}
