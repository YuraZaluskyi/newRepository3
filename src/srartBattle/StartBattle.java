package srartBattle;

import arena.Arena;
import managerArena.ManagerArena;

import java.util.Scanner;

public class StartBattle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ManagerArena managerArena = new ManagerArena(sc, Arena.getArena());

        while (true){
            printMenu();
            String choice = sc.next();

            switch (choice){
                case "1":
                    managerArena.listWarriors();
                    break;
                case "2":
                    managerArena.listWeapons();
                    break;
                case "3":
                    managerArena.startBattle();
                    break;

                    default:
                        return;
            }

        }

    }

    static void printMenu(){
        System.out.println();
        System.out.println();
        System.out.println("      ///////////////");
        System.out.println("      // A R E N A //");
        System.out.println("      ///////////////");
        System.out.println();
        System.out.println("1 - print list warriors");
        System.out.println("2 - print list weapons");
        System.out.println("3 - start the battle");
        System.out.println("EXIT - press any key");
        System.out.println();
        System.out.println();
        System.out.print("Yours choice...");
//        System.out.println();

    }
}
