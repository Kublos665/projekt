package interfaces;

import app.ApplicationProperties;
import managment.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public  void optionSelector(ApplicationProperties properties) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int loop;
        Information information = new Information();
        do
        {
            information.getMenu();
            loop = scanner.nextInt();

            switch (loop) {
                case 1 -> {
                    Boss boss = new Boss(properties.getBossHp(), properties.getBossDefense());
                    Budget budget = new Budget(properties.getBudget());
                    Troops troops = new Troops();
                    BudgetManagement budgetManagement = new BudgetManagement();


                    budgetManagement.buyUnits(troops, properties, budget,information);
                    information.getTroopsInfo(troops);

                    Simulation simulation = new Simulation();

                    simulation.startSimulation(troops, boss, properties,information);
                }
                case 2 -> information.getBestResults();
                case 3 -> {
                    FileManager.cleanResults();
                    System.out.println("\u001B[35m" + "Wyczyszczono historię wyników.\n");
                }
                default -> System.out.println("Kończę działanie programu.");
            }
        }
        while(loop != 4);
    }
}
