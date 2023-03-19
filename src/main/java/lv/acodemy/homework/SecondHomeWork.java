package lv.acodemy.homework;

import java.util.Arrays;

public class SecondHomeWork {


public static void main(String[] args) {

    System.out.println("=========== Task 1.1 ===============\n");

    String[] countries = {"UK", "USA", "China", "Latvia", "Spain", "Italy", "Egypt", "South Africa", "Australia", "Brasil"};
    for (int i = 0; i < countries.length; i++) {
        System.out.println(countries[i]);
    }

    System.out.println("\n=========== Task 1.2 ===============\n");

    String[] countriesMotherland = {"UK", "USA", "China", "Latvia", "Spain", "Italy", "Egypt", "South Africa", "Australia", "Brasil"};
    for (int i = 0; i < countriesMotherland.length; i++) {
        if (countriesMotherland[i].equals("Latvia")) {
            System.out.println("Latvia is my motherland");
        } else {
            System.out.println(countriesMotherland[i]);
        }
    }

    System.out.println("\n=========== Task 2 ===============\n");

    String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday", ",", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code", "."};
    for (int i = 0; i < sentence.length; i++) {
        System.out.print(sentence[i] + " ");
    }

    System.out.println("\n\n=========== Task 3 ===============\n");

    double i = 5000;
    if (i <= 5000) {
        System.out.println("Your salary is low.");
    } else if (i > 5000 && i <= 10000) {
        System.out.println("Your salary is average.");
    } else if (i > 10000) {
        System.out.println("Your salary is high.");
    }

    System.out.println("\n=========== Task 4 ===============\n");

    int j = -1;
    if (j == 0) {
        System.out.println("The numnber is zero");
    } else if (j > 0) {
        System.out.println("The numnber is positive");
    } else if (j < 0) {
        System.out.println("The numnber is negative");
    }
}
}



/*
Домашняя работа - DEADLINE: 18.03.2023

Create branch with name: homework_11032023
Create class with name: SecondHomeWork

1 Task:
1. Create String array that will contain 10 European countries and include "Latvia" in this array
1.1 Iterate through array and print all values
1.2 Iterate through array and add following logic: IF "Latvia" exist in the array print: "Latvia is my motherland"

*/


            /*

2 Task:
2. You hav following sentence: "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.”
2.1 Put each word into a String array.
2.1 Using Iteration (Loops) print all values from array so as the result will be printed sentence (one line)

3 Task:
Write a Java program that takes the user's salary as an argument (double) and checks if their salary is less than or equal to 5000, between 5000 and 10000, or greater than 10000. If their salary is less than or equal to 5000, print "Your salary is low." If their salary is between 5000 and 10000, print "Your salary is average." If their salary is greater than 10000, print "Your salary is high."

4 Task:
Write a Java program that takes a number as an argument (integer) and checks if the number is positive, negative or zero. If the number is positive, print "The number is positive." If the number is negative, print "The number is negative." If the number is zero, print "The number is zero."


Commit and push all the changes
Open PULL REQUEST and assign on acodemylv (Reviewer and Assignee)
 */
