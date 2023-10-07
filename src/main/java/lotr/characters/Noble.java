package lotr.characters;

import lombok.Getter;

import lotr.kick.NobleKick;
import java.util.concurrent.ThreadLocalRandom;

@Getter
public abstract class Noble extends Character {
    private int minPower;
    private int maxPower;

    public Noble(int minHp, int maxHp, int minPower, int maxPower) {
        super(random(minHp, maxHp), random(minPower, maxPower), new NobleKick());
        this.minPower = minPower;
        this.maxPower = maxPower;
    }

    private static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int randomDamage() {
        return random(minPower, maxPower);
    }
}
