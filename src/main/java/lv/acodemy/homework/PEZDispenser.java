package lv.acodemy.homework;

public class PEZDispenser {

    private String color;
    private String pezName;
    private String seriesName;
    private int candyCount;
    private final int MAX_CANDIES = 12;

    public PEZDispenser(String color, String pezName, String seriesName) {
        this.color = color;
        this.pezName = pezName;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDIES;
    }

    public String getColor() {
        return color;
    }

    public String getPezName() {
        return pezName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void eatCandy() {
        if (candyCount > 0) {
            candyCount--;
            System.out.println("Om-nom-nom");
        } else {
            System.out.println("No more candies left");
        }
    }

    public void addCandy() {
        if (candyCount == MAX_CANDIES) {
            System.out.println("You cannot add more candies. PEZ is full.");
        } else {
            candyCount++;
            System.out.println("Adding candy");
        }
    }

    public void fillDispenserFully() {
        candyCount = MAX_CANDIES;
        System.out.printf("Dispenser is now full and has %d candies\n", candyCount);
    }

    public void eatCandies(int takeCandies) {
        if (takeCandies == getCandyCount()) {
            candyCount -= takeCandies;
            System.out.println("Enjoy, but PEZ is empty now!Please re-fill PEZ");

        } else if (takeCandies < getCandyCount()) {
            candyCount -= takeCandies;
            System.out.printf("Enjoy, your %d candie(s), and PEZ has %d candie(s) left now!\n", takeCandies, getCandyCount());

        } else if (takeCandies > getCandyCount()) {
            System.out.printf("Not enough candies left in PEZ. You can only take %d candies\n", getCandyCount());
        }
    }
    public void addCandies(int addCandies) {
        if (getCandyCount() == MAX_CANDIES) {
            System.out.println("Your PEZ is already full");

        } else if (getCandyCount() < MAX_CANDIES) {
            candyCount += addCandies;
            System.out.printf("You've added %d candie(s), and PEZ has a total of %d candie(s) now!\n", addCandies, getCandyCount());
        }
    }
}
