package weapon;


public class Sword implements Weapon {
    private String name;
    private int damage;
    private int weight;

    public Sword() {
        setName("Sword");
        setDamage(10);
        setWeight(3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public int bit() {
        int a = 1 + (int)(Math.random()*(damage - 1) + 1);
//        return (int) (Math.random() * damage);
        return a;

    }

    @Override
    public String toString() {return name;
    }
}
