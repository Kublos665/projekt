package objects;

import app.ApplicationProperties;

public class Soldier {
    private int number;
    public static final int power = ApplicationProperties.soldierPower;;
    public static final int cost = ApplicationProperties.soldierCost;

    public Soldier(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
