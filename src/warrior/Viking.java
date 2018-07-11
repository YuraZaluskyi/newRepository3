package warrior;

import weapon.Weapon;


public class Viking extends Warrior {

    public Viking() {
        setName("Viking");
        setHealth(100);
        setPower(2);
        setAgility(1);
    }

    public Viking(Weapon weapon) {
        super(weapon);
        setName("Viking");
        setHealth(100);
        setPower(2);
        setAgility(1);
    }





}
