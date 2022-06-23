package app;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ApplicationProperties {
    public static final Config properties = ConfigFactory.parseResources("config.json");
    public static final int budget = properties.getInt("budget");
    public static final int soldierCost = properties.getInt("soldierCost");
    public static final int soldierPower = properties.getInt("soldierPower");;
    public static final int tankCost = properties.getInt("tankCost");;
    public static final int tankPower = properties.getInt("tankPower");
    public static final int rocketLauncherCost = properties.getInt("rocketLauncherCost");;
    public static final int rocketLauncherPower = properties.getInt("rocketLauncherPower");
    public static final float bossHp = properties.getInt("bossHp");
    public static final float bossDefense = properties.getInt("bossDefense");
}