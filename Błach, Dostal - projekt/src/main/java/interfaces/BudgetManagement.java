package interfaces;

import objects.*;

import java.util.Scanner;

public class BudgetManagement {
    public static Troops buyUnits(Budget budget)
    {
        Scanner scanner = new Scanner(System.in);
        int soldiers = 0;
        int tanks = 0;
        int rocketLaunchers = 0;
        int selector;

        while(budget.getMoney() > 0) {
            Information.printInformation(budget);
            System.out.println("Ilu chcesz żołnierzy? ");
            selector = scanner.nextInt();

            if(budget.getMoney() >= selector * Soldier.cost) {
                budget.removeMoney(selector * Soldier.cost);
                soldiers += selector;
            }
            else {
                System.out.println("Za mało środków!!");
            }

            System.out.println("Ile chcesz czołgów? ");
            selector = scanner.nextInt();

            if(budget.getMoney() >= selector * Tank.cost){
                budget.removeMoney(selector * Tank.cost);
                tanks += selector;
            }
            else {
                System.out.println("Za mało środków!!");
            }

            System.out.println("Ile chcesz wyrzutni rakiet? ");
            selector = scanner.nextInt();

            if(budget.getMoney() >= selector * RocketLauncher.cost) {
                budget.removeMoney(selector * RocketLauncher.cost);
                rocketLaunchers += selector;
            }
            else {
                System.out.println("Za mało środków!!");
            }
        }

        return new Troops(soldiers, tanks, rocketLaunchers);
    }
}
