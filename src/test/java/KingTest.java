import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import lotr.characters.Character;
import lotr.characters.King;

public class KingTest {
    private Character character;

    @BeforeEach
    public void init() { character = new King(); }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHp() >= 5 && character.getHp() <= 15);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 5 && character.getPower() <= 15);
    }
}