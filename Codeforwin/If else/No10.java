package Ifelse;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c;
        System.out.print("Enter any character: ");
        c = sc.next().charAt(0);

        if (Character.isAlphabetic(c)){
            if (Character.isUpperCase(c))
                System.out.println(c + " is uppercase alphabet");
            else
                System.out.println(c + " is lowercase alphabet");
        }
        else
            System.out.println(c + " is not Alphabet");
    }
}
