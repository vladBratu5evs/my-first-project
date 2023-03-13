package lv.acodemy.classroom;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Cat {


    private String name;
    private String color;
    @Setter
    private int age;
    @Setter
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;
    private final int MAX_ENERGY = 5;
    private int energy = 5;

    public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }

    public Cat(String name) {
        this.name = name;
    }

   // public Cat() {
   // }

    public void speak() {
        System.out.println("Meow!");
    }

    public void feed() {
        if (energy == 5) {
            System.out.println("I cannot eat anymore!");
        } else {
            energy++;
            System.out.println("Om-nom-nom!");
        }
    }
    //update method feed, so we can feed our cat;
    //every feed method call increase energy for 1;

    public void walk() {
        if (energy <= 0) {
            System.out.println("I don't have anough energy to walk!");
        } else {
            System.out.println("Walkie-walkie!");
            energy--;
        }
    }

}

