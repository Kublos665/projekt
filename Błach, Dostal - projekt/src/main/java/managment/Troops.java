package managment;

public class Troops {
    private int soldiers;
    private int tanks;
    private int rocketLaunchers;

    public Troops() {
        soldiers = 0;
        tanks = 0;
        rocketLaunchers = 0;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    public void setTanks(int tanks) {
        this.tanks = tanks;
    }

    public void setRocketLaunchers(int rocketLaunchers) {
        this.rocketLaunchers = rocketLaunchers;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public int getTanks() {
        return tanks;
    }

    public int getRocketLaunchers() {
        return rocketLaunchers;
    }

    public void addSoldiers(int soldiers){
        setSoldiers(this.getSoldiers() + soldiers);
    }

    public void addTanks(int tanks) {
        setTanks(this.getTanks() + tanks);
    }

    public void addRockets(int rockets) {
        setRocketLaunchers(this.getRocketLaunchers() + rockets);
    }
}
