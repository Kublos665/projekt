package interfaces;

import managment.*;
import objects.Boss;
import objects.Budget;
import objects.Troops;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void optionSelector() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int loop;

        do
        {
            Information.printMenu();
            loop = scanner.nextInt();

            switch (loop) {
                case 1 -> {
                    Boss boss = new Boss();
                    Budget budget = new Budget();
                    Troops troops = BudgetManagement.buyUnits(budget);

                    Information.printTroopsInfo(troops);

                    Simulation.startSimulation(troops, boss);
                }
                case 2 -> Information.printBestResults();
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