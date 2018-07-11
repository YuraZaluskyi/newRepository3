package weapon;


public class Axe implements Weapon {
    private String name;
    private int damage;
    private int weight;

    public Axe() {
        setName("Axe");
        setDamage(10);
        setWeight(4);
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
//        Min + (int)(Math.random() * ((Max - Min) + 1))
//        return (int) (Math.random() * damage);
        return a;

    }

    @Override
    public String toString() {
        return name;
    }
}
