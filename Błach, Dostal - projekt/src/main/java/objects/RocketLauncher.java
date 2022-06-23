package objects;

import app.ApplicationProperties;

public class RocketLauncher {
    private int number;
    public static final int power = ApplicationProperties.rocketLauncherPower;;
    public static final int cost = ApplicationProperties.rocketLauncherCost;

    public RocketLauncher(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
