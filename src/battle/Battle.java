package battle;


import warrior.Warrior;
import weapon.Weapon;

public class Battle {
    private Warrior warrior;
    private Weapon weapon; //!!!!!!!!!!!!я думаю цього поля не потрібно

    public Battle() {
    }

    public Battle(Warrior warrior, Weapon weapon) {
        this.warrior = warrior;
        this.weapon = weapon;
    }


    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //  This method describes battle between two warriors //
    public static void fight(Warrior warrior1, Warrior warrior2) {

        while ((warrior1.getHealth() > 0) && (warrior2.getHealth() > 0)) {
            warrior1.setHealth(warrior1.getHealth() - warrior2.getWeapon().bit());
            warrior2.setHealth(warrior2.getHealth() - warrior1.getWeapon().bit());
        }
        if (warrior1.getHealth() > 0 && warrior2.getHealth() <= 0) {
            System.out.println(warrior1.getName() + " is WINNER");
        } else if (warrior2.getHealth() > 0 && warrior1.getHealth() <= 0) {
            System.out.println(warrior2.getName() + " is WINNER");
        } else {
            System.out.println("NOBODY WON");
        }

    }


    @Override
    public String toString() {
        return "Battle{" +
                "warrior=" + warrior +
                ", weapon=" + weapon +
                '}';
    }
}
