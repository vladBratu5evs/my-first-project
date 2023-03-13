package lv.acodemy.classroom;

public class ObjectExample {

    public static void main(String[] args) {


       // System.out.println(barsik.name);
  /*barsik.name = "Barsik";
        barsik.breed = "Tuxedo";
        barsik.gender = "female";
        barsik.color = "black&white";
        barsik.hasFur = true;
        barsik.weight = 4.5;
*/
        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        //create getters and setters for; weight;
        //for all other fields create getter method;

        barsik.setWeight(6.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        //Create Constructor with name, color, breed, gender, hasFur
        //create cat with all these fields passed into constructor
        //print your cat

        Cat murlyka = new Cat("Murlyka", "Black&White", "Tuxedo", "Female", true);
        murlyka.setAge(1);
        murlyka.setWeight(4.5);
        System.out.println(murlyka);
        System.out.printf("My cat's name is %s. Cat is %d years old.\n", murlyka.getName(), murlyka.getAge());

        murlyka.walk();
        murlyka.walk();
murlyka.feed();
        System.out.println(murlyka.getEnergy());

        //update method feed, so we can feed our cat;
        //every feed method call increase energy for 1;





    }
}
