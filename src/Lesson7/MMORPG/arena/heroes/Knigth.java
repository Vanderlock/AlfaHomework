package Lesson7.MMORPG.arena.heroes;

public class Knigth extends Hero{
    private int armor;

    public Knigth(String name, int level, int health, int armor) {
        super(name,level,health);
        this.armor = armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", armor=" + armor +
                '}';
    }

}
