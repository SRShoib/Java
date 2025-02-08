package Ifelse;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c;
        System.out.print("Enter any character: ");
        c = sc.next().charAt(0);

        if (Character.isAlphabetic(c))
            System.out.println(c + " is an ALPHABET");
        else if (Character.isDigit(c))
            System.out.println(c + " is a digit");
        else
            System.out.println(c + " is a special character");
    }
}
