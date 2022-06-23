package managment;

public class ResultsRepository {
    private int numberOfTurns;
    private int healBossCounter;
    private int loseTroopsCounter;
    private int raiseDefenseCounter;
    private int doubleTroopsCounter;
    private final int numberOfSoldiers;
    private final int numberOfTanks;
    private final int numberOfRocketLaunchers;

    public ResultsRepository(int numberOfSoldiers,int numberOfTanks, int numberOfRocketLaunchers) {
        this.numberOfTurns = 0;
        this.healBossCounter = 0;
        this.loseTroopsCounter = 0;
        this.raiseDefenseCounter = 0;
        this.doubleTroopsCounter = 0;
        this.numberOfSoldiers = numberOfSoldiers;
        this.numberOfTanks = numberOfTanks;
        this.numberOfRocketLaunchers = numberOfRocketLaunchers;
    }

    public int getNumberOfSoldiers() {
        return numberOfSoldiers;
    }

    public int getNumberOfTanks() {
        return numberOfTanks;
    }

    public int getNumberOfRocketLaunchers() {
        return numberOfRocketLaunchers;
    }

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public int getLoseTroopsCounter() {
        return loseTroopsCounter;
    }

    public int getDoubleTroopsCounter() {
        return doubleTroopsCounter;
    }

    public int getHealBossCounter() {
        return healBossCounter;
    }

    public int getRaiseDefenseCounter() {
        return raiseDefenseCounter;
    }

    public void increaseNumberOfTurns() {
        numberOfTurns++;
    }

    public void increaseHealBossCounter() {
        healBossCounter++;
    }

    public void increaseLoseTroopsCounter() {
        loseTroopsCounter++;
    }

    public void increaseRaiseDefenseCounter() {
        raiseDefenseCounter++;
    }

    public void increaseDoubleTroopsCounter() {
        doubleTroopsCounter++;
    }
}
