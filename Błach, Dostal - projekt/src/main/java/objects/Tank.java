package objects;

import app.ApplicationProperties;

public class Tank {
    private int number;
    public static final int power = ApplicationProperties.tankPower;;
    public static final int cost = ApplicationProperties.tankCost;

    public Tank(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
