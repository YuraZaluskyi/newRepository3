package warrior;

import weapon.Weapon;


public class Samurai extends Warrior {

    public Samurai() {
        setName("Samurai");
        setHealth(100);
        setPower(2);
        setAgility(2);
    }

    public Samurai(Weapon weapon) {
        super(weapon);
        setName("Samurai");
        setHealth(100);
        setPower(2);
        setAgility(2);
    }


}
