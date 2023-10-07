package lotr.kick;

import lotr.characters.Character;

public interface KickStrategy {
    void kick(Character kicker, Character opponent);
}