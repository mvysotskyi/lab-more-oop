package lotr.character;

import java.util.List;
import java.util.Random;


public class CharacterFactory {
    public Character createCharacter() {
	List<Class<?>> classes = Arrays.toList(Knight.class, King.class, Elf.class, Hobbit.class);
	Class clazz = classes.get(new Random().nextInt(classes.size()));

	try {
	    return (Character) clazz.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
	    e.printStackTrace();
	}
    }
}
