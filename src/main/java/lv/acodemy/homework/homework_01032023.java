package lv.acodemy.homework;

import java.util.Arrays;

public class homework_01032023 {
    public static void main(String[] args) {

        // Create 2 variable for each data type (meaningful)
        // byte, short, char, int, long, float, double, boolean
        // Concatenation (write about myself)
        // Play with arithmetic operators (+, -, / .. )

        byte marathonCount = 1;
        System.out.println(marathonCount);
        byte marathonAge = 29; //Age at which I've run my first marathon
        System.out.println(marathonAge);
        short kmPerMonth = 250; //ran 250 per month during practice
        System.out.println(kmPerMonth);
        short halfMarathonDistanceInMeters = 21097;
        System.out.println(halfMarathonDistanceInMeters);
        char firstInitial = 118; //'v';
        System.out.println(firstInitial);
        char surnameInitial = 'B';
        System.out.println(firstInitial);
        int dateOfMyFirstMarathon = 10042022;
        System.out.println(dateOfMyFirstMarathon);
        int dateOfMyNextMarathon = 10092023;
        System.out.println(dateOfMyNextMarathon);
        long brightonMarathonParticipantCount = 12000;
        System.out.println(brightonMarathonParticipantCount);
        long myStepCountOnTheMarathonDay = 57367;
        System.out.println(myStepCountOnTheMarathonDay);
        float myMarathonResult = 4.24f; //4h 24 minutes
        System.out.println(myMarathonResult);
        float myAveragePace = 6.17f; //6 min 17 secs
        System.out.println(myAveragePace);
        double averageHearRate = 173; //bpm
        System.out.println(averageHearRate);
        double totalDistanceOnTheDay = 51.31; //km
        System.out.println(totalDistanceOnTheDay);
        boolean wasTargetAchieved = false;
        boolean willRunMarathonAgain = true;
        String name = "Vladislavs";
        String surName = "Bratusevs";
        //Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String marathonRecap = fullName + " finished Brighton's marathon in " + myMarathonResult + " with the pace of "
                + myAveragePace + " and average heartbeat of " + averageHearRate;
        System.out.printf(marathonRecap);


        // System.out.printf("My full name is: %s. I am %d years old\n", fullName, myMarathonResult);
        //System.out.printf("My full name is: %s. I am %d years old%n", fullName, myCurrentAge);

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

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

    }
}
