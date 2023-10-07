import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertTrue;

import lotr.CharacterFactory;
import lotr.characters.Character;

public class CharacterFactoryTest {
    private CharacterFactory characterFactory;

    @BeforeEach
    public void init() { characterFactory = new CharacterFactory(); }

    @Test
    public void returnsCharacter() throws Exception {
        Character character = characterFactory.getRandomInstance();
        assertTrue(character instanceof Character);
    }

    @Test
    public void returnsNonAbstractClass() throws Exception {
        Character character = characterFactory.getRandomInstance();
        assertTrue(!Modifier.isAbstract(character.getClass().getModifiers()));
    }
}