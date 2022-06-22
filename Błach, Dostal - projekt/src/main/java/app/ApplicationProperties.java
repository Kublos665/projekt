package app;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ApplicationProperties {
    Config properties = ConfigFactory.parseResources("config.json");
    private final int budget;

    private final int soldierCost;
    private final int soldierPower;

    private final int tankCost;
    private final int tankPower;

    private final int rocketLauncherCost;
    private final int rocketLauncherPower;

    private final float bossHp;
    private final float bossDefense;

    ApplicationProperties() {
        this.budget = properties.getInt("budget");
        this.soldierCost = properties.getInt("soldierCost");
        this.tankCost = properties.getInt("tankCost");
        this.rocketLauncherCost = properties.getInt("rocketLauncherCost");
        this.bossHp = properties.getInt("bossHp");
        this.bossDefense = properties.getInt("bossDefense");
        this.soldierPower = properties.getInt("soldierPower");
        this.tankPower = properties.getInt("tankPower");
        this.rocketLauncherPower = properties.getInt("rocketLauncherPower");
    }

    public int getBudget() {
        return budget;
    }

    public int getSoldierCost() {
        return soldierCost;
    }

    public int getTankCost() {
        return tankCost;
    }

    public int getRocketLauncherCost() {
        return rocketLauncherCost;
    }

    public float getBossHp() {
        return bossHp;
    }

    public float getBossDefense() {
        return bossDefense;
    }

    public int getSoldierPower() {
        return soldierPower;
    }

    public int getTankPower() {
        return tankPower;
    }

    public int getRocketLauncherPower() {
        return rocketLauncherPower;
    }
}
