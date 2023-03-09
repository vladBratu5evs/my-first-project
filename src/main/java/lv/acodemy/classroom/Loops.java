package lv.acodemy.classroom;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
        for(int i = 0; i < 10; i++) {
        //define counter;
        //condition
        //increment
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        //numbers[0] = 1
        //numbers[1] = 2

       for (int i = 0; i < numbers.length; i ++) {
           //System.out.println(numbers[i]);
           System.out.print(numbers[i] + " ");
       }

        for (int j : numbers) {
            if (j % 2 == 0) {
                System.out.println(j);
            }

            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }

            for (int number : numbers) {
                System.out.println(number);
            }

            //crete String array with 10 names
            //print all names using for & for each

            String[] names = {"John", "Mike", "Jake", "Dave", "Rob", "Wayne", "Sam", "Martin", "Gareth", "Rocky"};
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }

            for (String name: names) {
                System.out.println(name);
            }
        }
    }
}
