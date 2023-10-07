package lotr;

import lotr.characters.Character;

import org.reflections.Reflections;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    private static String packageName = "lotr.characters";

    private List<Class<? extends Character>> getClassesInPackage() {
        Reflections reflections = new Reflections(packageName);
        Set<Class<? extends Character>> allClasses = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> nonAbstractClasses = new ArrayList<>();

        for (Class<? extends Character> clazz : allClasses) {
            if (!clazz.isInterface() && !java.lang.reflect.Modifier.isAbstract(clazz.getModifiers())) {
                nonAbstractClasses.add(clazz);
            }
        }

        return nonAbstractClasses;
    }

    public Character getRandomInstance() throws Exception {
        List<Class<? extends Character>> classes = getClassesInPackage();

        if (classes.isEmpty()) {
            throw new IllegalStateException("No classes found in the specified package.");
        }

        Random random = new Random();
        Class<? extends Character> randomClass = classes.get(random.nextInt(classes.size()));

        Constructor<?>[] constructors = randomClass.getDeclaredConstructors();
        Constructor<?> randomConstructor = constructors[random.nextInt(constructors.length)];
        randomConstructor.setAccessible(true);

        return (Character)(randomConstructor.newInstance());
    }
}
