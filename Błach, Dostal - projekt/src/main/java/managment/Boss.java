package managment;

public class Boss {
    public float hp;
    public float defense;

    public Boss(float hp, float defense) {
        this.hp = hp;
        this.defense = defense;
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
