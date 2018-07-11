package arena;

import battle.Battle;
import warrior.Samurai;
import warrior.Viking;
import warrior.Warrior;
import weapon.Axe;
import weapon.Sword;
import weapon.Weapon;

public class Arena {

    private Warrior[] warriors = {new Samurai(), new Viking()};
    private Weapon[] weapons = {new Sword(), new Axe()};
//    private Battle battle;

    private static Arena arena = new Arena();

    public static Arena getArena() {
        return arena;
    }


    private Arena() {
    }

    public Arena(Warrior[] warriors, Weapon[] weapons) {
        this.warriors = warriors;
        this.weapons = weapons;

    }


    public Warrior[] getWarriors() {
        return warriors;
    }

    public void setWarriors(Warrior[] warriors) {
        this.warriors = warriors;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    // Select the warrior
    public Warrior selectWarrior(int numberWarrior) {
        Warrior warrior = warriors[numberWarrior];
        return warrior;
    }

    // Select the weapon
    public Weapon selectWeapon(int numberWeapon) {
        Weapon weapon = weapons[numberWeapon];
        return weapon;
    }

    // Srart the battle
    public void startBattle(Warrior warrior1, Warrior warrior2, Weapon weapon1, Weapon weapon2) {
        warrior1.setWeapon(weapon1);
        warrior2.setWeapon(weapon2);
        Battle.fight(warrior1, warrior2);
    }

}
