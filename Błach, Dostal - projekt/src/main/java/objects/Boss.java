package objects;

import app.ApplicationProperties;

public class Boss {
    private float hp;
    private float defense;

    public Boss() {
        this.hp = ApplicationProperties.bossHp;
        this.defense = ApplicationProperties.bossDefense;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getDefense() {
        return defense;
    }
    public void setDefense(float defense) {
        this.defense = defense;
    }

    public void takeDamage(int damage) {
        setHp(this.getHp() - damage * (100/this.getDefense()));
    }
}
