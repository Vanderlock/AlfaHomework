package Lesson7.MMORPG;

import Lesson7.MMORPG.arena.heroes.*;

public class App {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Knigth("Boromir", 2  , 100, 200 ),
                new Archer("Legolas", 3, 80, 1000),
                new Mage("Gendalf", 5, 50, 500)
        };

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("--- Герой " + (i + 1) + " ---");
            heroes[i].printInfo();
            heroes[i].attack();
            System.out.println();
        }

        final Knigth knigth = new Knigth("Gimli", 2, 150, 300);

        System.out.println(knigth.toString());
        knigth.setArmor(500);
        System.out.println(knigth.toString());


    }
}
