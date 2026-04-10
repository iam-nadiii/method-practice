package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fName = input.next();

        System.out.println("Enter your last name: ");
        String lName = input.next();

        System.out.println("Your name is " + formatName(fName, lName) + ".");
    }

    static String formatName(String first, String last){
        return last + ", " + first;
    }
}






