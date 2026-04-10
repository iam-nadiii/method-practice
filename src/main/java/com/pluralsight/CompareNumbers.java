package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check if it is even: ");
        int number = input.nextInt();

        System.out.println("It would be " + isEven(number) + " if we said " +
                "that " + number + " is even.");

        System.out.println("Enter a number to check if it is positive: ");
        Double number2 = input.nextDouble();

        System.out.println("It would be " + isPostive(number2) + " if we said " +
                "that " + number2 + " is positive.");
    }

    static boolean isEven(int number){
        if (number % 2 == 0){
            return  true;
        }
        return false;
    }

    static boolean isPostive(double number){
        if (number > 0){
            return true;
        }
        return  false;
    }
}


