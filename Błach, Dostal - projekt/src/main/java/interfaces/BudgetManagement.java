package interfaces;

import app.ApplicationProperties;
import managment.Budget;
import managment.Troops;

import java.util.Scanner;

public class BudgetManagement {
    public  void buyUnits(Troops troops, ApplicationProperties appP, Budget budget,Information information)
    {
        Scanner scanner = new Scanner(System.in);
        int soldier;
        int tank;
        int rocketLauncher;

        while(budget.getMoney() > 0) {
            information.getInformation(budget,appP);
            System.out.println("Ilu chcesz zolnierzy? ");
            soldier = scanner.nextInt();

            if(budget.getMoney() >= soldier*appP.getSoldierCost()) {
                budget.removeMoney(soldier * appP.getSoldierCost());
                troops.addSoldiers(soldier);
            }else {
                System.out.println("Za malo srodkow!!");
            }

            System.out.println("Ile chcesz czolgow? ");
            tank = scanner.nextInt();

            if(budget.getMoney() >= tank*appP.getTankCost()){
                budget.removeMoney(tank*appP.getTankCost());
                troops.addTanks(tank);
            }else {
                System.out.println("Za malo srodkow!!");
            }

            System.out.println("Ile chcesz wyrzutni rakiet? ");
            rocketLauncher = scanner.nextInt();

            if(budget.getMoney() >= rocketLauncher*appP.getRocketLauncherCost()) {
                budget.removeMoney(rocketLauncher * appP.getRocketLauncherCost());
                troops.addRockets(rocketLauncher);
            }else {
                System.out.println("Za malo srodkow!!");
            }
        }
    }
}
