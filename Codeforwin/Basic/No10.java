package Basic;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days;
        System.out.print("Enter days: ");
        days = sc.nextInt();

        System.out.println("YEARS: " + (days / 365));
        System.out.println("WEEKS: " + ((days % 60) / 7));
        System.out.println("DAYS: " + ((days % 365) % 7));
    }
}
