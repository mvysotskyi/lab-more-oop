package lotr.kick;
import lotr.characters.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character opponent) {
        if (opponent.getPower() < kicker.getPower()) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}
