package Basic;

import java.util.Scanner;

public class No16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float eng, phy, chem, math, comp;
        System.out.println("Enter marks of five subjects: ");
        eng = sc.nextFloat(); phy = sc.nextFloat(); chem = sc.nextFloat();
        math = sc.nextFloat(); comp = sc.nextFloat();

        System.out.printf("Total marks = %.2f\n", eng + phy + chem + math + comp);
        System.out.printf("Average marks = %.2f\n", (eng + phy + chem + math + comp) / 5f);
        System.out.printf("Percentage = %.2f\n", ((eng + phy + chem + math + comp) / 500f) * 100);
    }
}
