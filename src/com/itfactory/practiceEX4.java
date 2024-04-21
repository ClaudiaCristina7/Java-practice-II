package com.itfactory;

import java.util.Scanner;

public class practiceEX4 {
    public static void main(String[] args){

        /*➔ The requirement is to read two numbers from the keyboard and display the rest of their division.
Example: If we read 10 and 3, the remainder of dividing 10 by 3 will be 1*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        int numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("The first number is: " + numberOne);

        System.out.println("Enter second number: ");
        int numberTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("The second number is: " + numberTwo);

        System.out.println("The remainder of the two numbers is: "+ numberOne%numberTwo);

        //showing multiplication of the two numbers and division (with comma) of the two numbers
        System.out.println("The multiplication of the two numbers equals: "+ numberTwo*numberOne);
        System.out.println("The result of division of the two numbers is: " +(double)numberOne/numberTwo);
    }
}
