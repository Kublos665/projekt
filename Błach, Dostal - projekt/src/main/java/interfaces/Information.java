package interfaces;

import app.ApplicationProperties;
import managment.Budget;
import managment.FileManager;
import managment.ResultsRepository;
import managment.Troops;

public  class Information {
    public  void getMenu() {
        System.out.println("\u001B[0m" + "1) Rozpocznij symulację.");
        System.out.println("2) Wypisz 5 najlepszych rezultatow.");
        System.out.println("3) Wyczyść wyniki.");
        System.out.println("4) Zakończ działanie programu.\n");
        System.out.print("Wybierz, co chcesz zrobić: ");
    }

    public  void getInformation(Budget budget, ApplicationProperties appP) {
        System.out.println("Do rozdysponowania masz "  + budget.getMoney() + "$\n");
        System.out.println("Cennik jednostek (za sztuke):");
        System.out.println("- Zolnierz: " + appP.getSoldierCost() + "$");
        System.out.println("- Czolg: " + appP.getTankCost() + "$");
        System.out.println("- Wyrzutnia Rakiet: " + appP.getRocketLauncherCost() + "$\n");
    }

    public  void getTroopsInfo(Troops troops) {
        System.out.println("Liczebność armii:");
        System.out.println("- " + troops.getSoldiers() + " żołnierzy");
        System.out.println("- " + troops.getTanks() + " czołgów");
        System.out.println("- " + troops.getRocketLaunchers() + " wyrzutni rakiet");
    }

    public  void printVictory(ResultsRepository results) {
        System.out.println("\u001B[32m" + "Zwycięstwo! Twoje jednostki wygrały w " + results.getNumberOfTurns() + " tur!\n");
    }

    public  void printDefeat(ResultsRepository results) {
        System.out.println("\u001B[31m" + "Porażka! Twoje siły zostały rozgromione w " + results.getNumberOfTurns() + " tur!\n");
    }

    public  void getBestResults() { //tutaj ogólnie jest duży problem, ta metoda jest mało bezpieczna i wymaga dopracowania :(
        ResultsRepository[] results = FileManager.readResults();
        ResultsRepository currentBest = results[0];
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

        }
    }
}
