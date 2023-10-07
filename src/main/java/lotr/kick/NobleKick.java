package lotr.kick;

import lotr.characters.Character;
import lotr.characters.Noble;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character opponent) {
        int damage = ((Noble)kicker).randomDamage();
        opponent.setHp(opponent.getHp() - damage);
    }
}
