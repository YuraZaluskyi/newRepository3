package warrior;


import weapon.Weapon;

public abstract class Warrior {
    private String name;
    private int health;
    private int power;
    private int agility;
    private Weapon weapon;

    public Warrior() {
    }



    public Warrior(Weapon weapon) {
        this.health = health;
        this.power = power;
        this.agility = agility;
        this.weapon = weapon;

    }

    public Warrior(String name, int health, int power, int agility, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.agility = agility;
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return name;
    }
}
