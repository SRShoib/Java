package New;

import java.util.Scanner;

class Car{
    private String name, model, color;
    private double speed;
    public void setValue(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void display(){
        System.out.println("Name is : " + this.name);
        System.out.println("Model is: " + this.model);
        System.out.println("Color is : " + this.color);
        System.out.println("Speed is : " + this.speed);
    }
        }

public class Shoib {
    public static void main(String[] args) {
        Car Lamborgini, BMW;
        Lamborgini = new Car();
        BMW = new Car();
        Scanner sc = new Scanner(System.in);
        String name1, model1, color1, name2, model2, color2;
        double speed1, speed2;

        System.out.println("Enter name, model, color, speed of 1st object:");
        Lamborgini.setValue(name1=sc.nextLine(), model1=sc.nextLine(), color1=sc.nextLine());
        Lamborgini.setSpeed(speed1=sc.nextDouble());

        sc.nextLine();
        System.out.println("Enter name, model, color, speed of 2nd object:");
        BMW.setValue(name2=sc.nextLine(), model2=sc.nextLine(), color2=sc.nextLine());
        BMW.setSpeed(speed2=sc.nextDouble());

        System.out.println("For 1st object:");
        Lamborgini.display();

        System.out.println("\nFor 2nd object:");
        BMW.display();
    }
}
