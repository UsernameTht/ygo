package io.github.some_example_name.lwjgl3;


public class Monster {
    private String name;
    private int attackPoints;
    private int defensePoints;

    public Monster(String name, int attackPoints, int defensePoints) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void attack(Monster opponent) {
        System.out.println(this.name + " attacks " + opponent.getName() + "!");

        if (this.attackPoints > opponent.getDefensePoints()) {
            int damage = this.attackPoints - opponent.getDefensePoints();
            System.out.println(opponent.getName() + " takes " + damage + " damage!");
        } else {
            System.out.println(opponent.getName() + " successfully defends!");
        }
    }
}




