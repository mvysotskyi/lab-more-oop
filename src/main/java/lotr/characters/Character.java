package lotr.characters;

import lotr.kick.KickStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }
    
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
