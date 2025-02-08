package com.pack;

class Human{
    String name;
    String walk;
    int eye;
    int nose;
    int hand;
    int ear;
    void eat(){
        System.out.println("Yes");
    }
    Human(String name , String walk, int eye, int nose, int hand, int ear){
        this.name = name;
        this.walk = walk;
        this.eye = eye;
        this.nose = nose;
        this.hand = hand;
        this.ear = ear;

    }
}
public class Exlore {
//     final static int a = 13;
    public static void main(String[] args) {

       Human m = new Human("Mehedi", "Yes", 2, 1, 2, 2);
//
        System.out.println(m.name + "\n" + m.eye + "\n" + m.nose + "\n" + m.hand + "\n" + m.ear);
    }
}