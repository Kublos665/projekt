package managment;

import objects.Boss;
import objects.Troops;

public class RandomEvents {
        public static void healBoss(Boss boss) {
            boss.setHp(boss.getHp() + boss.getHp() / 10);
        }

        public static void loseTroops(Troops troops) {
            troops.setSoldiers(troops.getSoldiers() - ((troops.getSoldiers() / 2)));
            troops.setTanks(troops.getTanks() - ((troops.getTanks() / 2)));
            troops.setRocketLaunchers(troops.getRocketLaunchers() - ((troops.getRocketLaunchers() / 2)));
        }

        public static void raiseDefense(Boss boss) {
            boss.setDefense(boss.getDefense() + 20);
        }

        public static void doubleTroops(Troops troops) {
            troops.setRocketLaunchers(troops.getRocketLaunchers() * 2);
            troops.setSoldiers(troops.getSoldiers() * 2);
            troops.setTanks(troops.getTanks() * 2);
        }
}
