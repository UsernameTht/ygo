public class Player {
    private String name;
    private int lifePoints;

    public Player(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void takeDamage(int damage) {
        this.lifePoints -= damage;
        if (this.lifePoints < 0) {
            this.lifePoints = 0;
        }
    }

    public boolean isDefeated() {
        return lifePoints <= 0;
    }
}


