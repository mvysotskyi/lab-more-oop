package lotr.characters;

import lombok.Getter;


@Getter
public abstract class Character {
    private int hp;
    private int power;
    
    public Character(int hp, int power) {
	    this.hp = hp;
	    this.power = power;
    }

    public abstract void kick(Character chr);
    
    public boolean isAlive() {
	    return hp > 0;
    }

    public void setHp(int hp) {
	    this.hp = (hp < 0) ? 0: hp;
    }
    
    public String toString() {
	    String className = this.getClass().getSimpleName();
	    return className + "{hp=" + hp + ", power=" + power + "}";
    }
}
