package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        //byte data type
        byte myCurrentAge = 30;
        System.out.println(myCurrentAge);

        //short data type
        short salary = 1000;
        System.out.println(salary);

        //char data type
        char firstNameLetter = 118; //'v';
        System.out.println(firstNameLetter);

        //int data type
        int dateOfBirth = 160692;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        //flot data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        //double data type
        double weight = 84;
        System.out.println(weight);

        //boolean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        //String
        String name = "Vladislavs";
        String surName = "Bratusevs";

        //Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
       // System.out.println();

        System.out.printf("My full name is: %s. I am %d years old\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old%n", fullName, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        //division
        double result = (double) a / b;
        System.out.println(result);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

    }
}
