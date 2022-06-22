package managment;

import app.ApplicationProperties;
import interfaces.Information;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Simulation {
    static ArrayList<ResultsRepository> results = new ArrayList<>();

    public void startSimulation(Troops troops, Boss boss, ApplicationProperties appP,Information information) throws IOException {
        ResultsRepository simulationCounter = new ResultsRepository(troops.getSoldiers(),troops.getTanks(), troops.getRocketLaunchers());


        while(boss.getHp() >= 0) {

            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            if(randomNumber < 80) {
                boss.takeDamage(appP.getSoldierPower() * troops.getSoldiers());
                boss.takeDamage(appP.getTankPower() * troops.getTanks());
                boss.takeDamage(appP.getRocketLauncherPower() * troops.getRocketLaunchers());
            }
            else if(randomNumber < 85) {
                RandomEvents.healBoss(boss);
                simulationCounter.increaseHealBossCounter();
            }
            else if(randomNumber < 90) {
                if((troops.getSoldiers()<=1) && (troops.getTanks()<=1) && (troops.getRocketLaunchers()<=1)){
                    break;
                }else{
                    RandomEvents.loseTroops(troops);
                    simulationCounter.increaseLoseTroopsCounter();
                }


            }
            else if(randomNumber < 98) {
                RandomEvents.raiseDefense(boss);
                simulationCounter.increaseRaiseDefenseCounter();
            }
            else {
                RandomEvents.doubleTroops(troops);
                simulationCounter.increaseDoubleTroopsCounter();
            }
            //System.out.println(boss.getHp(boss));
            simulationCounter.increaseNumberOfTurns();
        }

        if(boss.getHp() <= 0) {
            information.printVictory(simulationCounter);
            results.add(simulationCounter);
            FileManager.saveResults(results);
        }
        else {
            information.printDefeat(simulationCounter);
        }
    }
}
