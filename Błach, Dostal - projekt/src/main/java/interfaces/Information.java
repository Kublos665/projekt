package interfaces;

import objects.*;
import managment.FileManager;
import managment.ResultsRepository;

import java.util.List;

public class Information {
    public static void printMenu() {
        System.out.println("\u001B[0m" + "1) Rozpocznij symulację.");
        System.out.println("2) Wypisz 5 najlepszych rezultatow.");
        System.out.println("3) Wyczyść wyniki.");
        System.out.println("4) Zakończ działanie programu.\n");
        System.out.print("Wybierz, co chcesz zrobić: ");
    }

    public static void printInformation(Budget budget) {
        System.out.println("Do rozdysponowania masz " + budget.getMoney() + "$\n");
        System.out.println("Cennik jednostek (za sztuke):");
        System.out.println("- Zolnierz: " + Soldier.cost + "$");
        System.out.println("- Czolg: " + Tank.cost + "$");
        System.out.println("- Wyrzutnia Rakiet: " + RocketLauncher.cost + "$\n");
    }

    public static void printTroopsInfo(Troops troops) {
        System.out.println("Liczebność armii:");
        System.out.println("- " + troops.getSoldiers() + " żołnierzy");
        System.out.println("- " + troops.getTanks() + " czołgów");
        System.out.println("- " + troops.getRocketLaunchers() + " wyrzutni rakiet");
    }

    public static void printVictory(ResultsRepository results) {
        System.out.println("\u001B[32m" + "Zwycięstwo! Twoje jednostki wygrały w " + results.getNumberOfTurns() + " tur!\n");
    }

    public static void printDefeat(ResultsRepository results) {
        System.out.println("\u001B[31m" + "Porażka! Twoje siły zostały rozgromione w " + results.getNumberOfTurns() + " tur!\n");
    }

    public static void printBestResults() {
        List<ResultsRepository> results = FileManager.readResults();
        ResultsRepository currentBest = results.get(0);
        int index = 0;

        System.out.println("\u001B[34m" + "Twoje 5 najlepszych wyników:");

        for(int topNumber = 0; topNumber < 5; topNumber++) {
            for(ResultsRepository result : results) {
                if(currentBest.getNumberOfTurns() > result.getNumberOfTurns()) {
                    currentBest = result;
                }

                index++;
            }

            System.out.println(topNumber + ") Liczba tur: " + currentBest.getNumberOfTurns());
            System.out.println("   Początkowa liczba żołnierzy: "+currentBest.getNumberOfSoldiers());
            System.out.println("   Początkowa liczba czołgów: "+currentBest.getNumberOfTanks());
            System.out.println("   Początkowa liczba wyrzutni rakiet: "+currentBest.getNumberOfRocketLaunchers());
            System.out.println("   Utracono jednostki tyle razy: " + currentBest.getLoseTroopsCounter());
            System.out.println("   Podwojono jednostki tyle razy: " + currentBest.getDoubleTroopsCounter());
            System.out.println("   Boss wyleczył się tyle razy: " + currentBest.getHealBossCounter());
            System.out.println("   Boss zwiększył swoją obronę tyle razy: " + currentBest.getRaiseDefenseCounter());

            results.remove(index);
        }
    }
}