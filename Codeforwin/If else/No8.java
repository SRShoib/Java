package Ifelse;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char c;
        System.out.print("Enter any character: ");
        c = sc.next().charAt(0);

        if (Character.isAlphabetic(c)){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                System.out.println(c + " is Vowel");
            else
                System.out.println(c + " is Consonant");
        }
        else
            System.out.println(c + " is not Alphabet");
    }
}
