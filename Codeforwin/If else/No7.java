package Ifelse;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c;
        System.out.print("Enter any character: ");
        c = sc.next().charAt(0);

        if (Character.isAlphabetic(c))
            System.out.println("Character is an ALPHABET");
        else
            System.out.println("Character is not ALPHABET");
    }
}
