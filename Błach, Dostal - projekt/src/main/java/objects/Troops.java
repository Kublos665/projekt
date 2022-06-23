package objects;

public class Troops {
    private Soldier soldiers;
    private Tank tanks;
    private RocketLauncher rocketLaunchers;

    public Troops(int numberOfSoldiers, int numberOfTanks, int numberOfRocketLaunchers) {
        soldiers = new Soldier(numberOfSoldiers);
        tanks = new Tank(numberOfTanks);
        rocketLaunchers = new RocketLauncher(numberOfRocketLaunchers);
    }

    public void setSoldiers(int soldiers) {
        this.soldiers.setNumber(soldiers);
    }

    public void setTanks(int tanks) {
        this.tanks.setNumber(tanks);
    }

    public void setRocketLaunchers(int rocketLaunchers) {
        this.rocketLaunchers.setNumber(rocketLaunchers);
    }

    public int getSoldiers() {
        return this.soldiers.getNumber();
    }

    public int getTanks() {
        return this.tanks.getNumber();
    }

    public int getRocketLaunchers() {
        return this.rocketLaunchers.getNumber();
    }
}
