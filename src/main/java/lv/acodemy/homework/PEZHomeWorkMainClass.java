package lv.acodemy.homework;

public class PEZHomeWorkMainClass {
    public static void main(String[] args) {
      PEZDispenser thor = new PEZDispenser("black", "Thor", "Marvel" );
        System.out.println(thor.getPezName() + " " + thor.getColor() + " " + thor.getSeriesName());

        thor.getCandyCount();
        System.out.println(thor.getCandyCount() + " candies left");
        thor.eatCandy();
        thor.getCandyCount();
        System.out.println(thor.getCandyCount() + " candies left");
        thor.addCandy();
        System.out.println(thor.getCandyCount() + " candies left");
      thor.addCandy();
      thor.getCandyCount();
      thor.eatCandy();
      thor.eatCandy();
      thor.eatCandy();
      thor.eatCandy();
thor.fillDispenserFully();
thor.getCandyCount();
      System.out.println(thor.getCandyCount() + " candies left");
thor.eatCandies(10);
thor.getCandyCount();
      System.out.println(thor.getCandyCount() + " candies left");
      thor.eatCandies(2);
      thor.getCandyCount();
      System.out.println(thor.getCandyCount() + " candies left");
      thor.eatCandies(1);
      thor.getCandyCount();
      thor.addCandies(5);
      thor.addCandies(7);
      thor.addCandies(1);
    System.out.println(thor.getCandyCount());
    }

}






/*
Задание: сделать PEZ dispenser (наверняка знаете что это такое)
PEZ dispenser должен иметь возможность:
- отдавать по одной конфетке
- отдавать любое количество нам нужных конфет
- загружать целиком недостающие конфеты
- загружать по одной конфетке
- загружать любое количество конфет

Очень важно:
продумать логику чтобы нельзя было съесть больше количество конфет чем реально есть так же как и загрузить и тд

PEZ должен иметь название, цвет и название серии (это может быть MARVEL, MARIO, LOONEY TUNES и тд) - все это надо подавать в конструктор при создании объекта
На выходе должно быть два класса (один с описанием полей, методов нашего класса PezDispenser), второе сам класс где будете создавать объект и играться с методами
 */