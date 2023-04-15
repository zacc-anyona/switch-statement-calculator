/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anyona Zaddock
 */
import java.util.Scanner;
public class Calculator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("I will your calculator!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Select your choice of operation!");
        int choice = input.nextInt();
        
        System.out.println("Enter your FIRST number: ");
        double x = input.nextDouble();
        System.out.println("Enter your SECOND number: ");
        double y = input.nextDouble();
        
        switch (choice) {
            case 1 -> System.out.println("Your answer: " + ( x + y));
            case 2 -> System.out.println("Your answer: " + (x - y));
            case 3 -> System.out.println("Your answer: " + (x * y));
            case 4 -> System.out.println("Your answer: " + (x / y));
            default -> System.out.println("Invalid Choice!");
        }
    }
}
