package lotr.kick;
import lotr.characters.Character;

public class CryKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character opponent) {
        System.out.println("Cry");
    }
}
