package managerArena;


import arena.Arena;
import warrior.Warrior;
import weapon.Weapon;

import java.util.Scanner;

public class ManagerArena {

    private Scanner sc;
    private Arena arena;

    public ManagerArena(Scanner sc, Arena arena) {
        this.sc = sc;
        this.arena = arena;
    }


    // Print list of Warriors
    public void listWarriors() {
        Warrior[] warriors;
        System.out.println();
        System.out.println();
        System.out.println("   W A R R I O R S");
        int numberWarrior = 1;
        for (Warrior i : arena.getWarriors()) {
            System.out.print(numberWarrior++ + " - ");
            System.out.println(i);
        }
    }

    // Print list of Weapons
    public void listWeapons() {
        Weapon[] weapons;
        System.out.println();
        System.out.println();
        System.out.println("   W E A P O N S");
        int numberWeapon = 1;
        for (Weapon i : arena.getWeapons()) {
            System.out.print(numberWeapon++ + " - ");
            System.out.println(i);
        }
    }

    // Select the warrior for fight
    public void selectWarriorForFight() {
        System.out.println("Select kind of the warrior");
        System.out.println("Enter a number");
        int numberWarrior = sc.nextInt();
        arena.selectWarrior(numberWarrior);
    }

    // Select the weapon for fight
    public void selectWeaponForFight() {
        System.out.println("Select kind of the weapon");
        System.out.println("Enter a number");
        int numberWeapon = sc.nextInt();
        arena.selectWeapon(numberWeapon);
    }

    // Start the battle
    public void startBattle() {
        System.out.println("       *******************************");
        System.out.println("*****  S T A R T   T H E   B A T T L E *****");
        System.out.println("       *******************************");
        System.out.println();
        System.out.println("Select kind of the first warrior");
        listWarriors();
        System.out.print("Enter the number first of the warrior...");
        int numberWarrior1 = sc.nextInt();
        numberWarrior1 = numberWarrior1 - 1;
        System.out.println();
        System.out.println("Select kind of the weapon for first warrior");
        listWeapons();
        System.out.print("Enter the number of the weapon for first warrior...");
        int numberWeapon1 = sc.nextInt();
        numberWeapon1 = numberWeapon1 - 1;
        System.out.println();

        System.out.println("Select kind of the second warrior");
        listWarriors();
        System.out.print("Enter the number second of the warrior...");
        int numberWarrior2 = sc.nextInt();
        numberWarrior2 = numberWarrior2 - 1;
        System.out.println();
        System.out.println("Select kind of the weapon for second warrior");
        listWeapons();
        System.out.print("Enter the number of the weapon for second warrior...");
        int numberWeapon2 = sc.nextInt();
        numberWeapon2 = numberWeapon2 - 1;
        System.out.println();
        arena.startBattle(arena.selectWarrior(numberWarrior1)
                , arena.selectWarrior(numberWarrior2)
                , arena.selectWeapon(numberWeapon1)
                , arena.selectWeapon(numberWeapon2));









    }


}
