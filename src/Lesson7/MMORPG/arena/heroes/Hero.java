package Lesson7.MMORPG.arena.heroes;

public class Hero  {
    protected final String name;
    protected int level = 1;
    protected int health = 100;
    public final static int MAX_LEVEL = 80;
    private static int heroesCreated = 0;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        heroesCreated ++;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }

    public void printInfo(){
        System.out.println("═══════════════════════════════");
        System.out.println("⚔️  Герой: " + name);
        System.out.println("📊 Уровень: " + level);
        System.out.println("❤️  Здоровье: " + health + " HP");
        System.out.println("═══════════════════════════════");
    }

    public void takeDamage(int damage){
        if (damage >= health){
            health = 0;
        } else {
            health = health - damage;
        }
    }

    public void levelUp(){
        if (level < MAX_LEVEL ){
            level ++;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times){
        System.out.println("Герой атакует цель " + target + " " + times +  " раза");
    }

    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public final void rest(){
        System.out.println("Герой отдыхает и восстанавливает силы.");

    }


}
