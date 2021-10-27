package ua.aleksandr.ciklumhomework.Collections.part3;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Part3 {

    static Logger log = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("just");
        strings.add("some");
        strings.add("strings");
        strings.add("strings");

        for(String s : strings) {
            log.info(s);
        }

        log.info("\n");

        HashSet<String> linkedStrings = new LinkedHashSet<>();
        linkedStrings.add("just");
        linkedStrings.add("some");
        linkedStrings.add("strings");
        linkedStrings.add("strings");

        for(String s : linkedStrings) {
            log.info(s);
        }

        log.info("\n");

        Animal cat = new Animal("Barsik", 3);
        Animal dog = new Animal("Sharik", 11);
        Animal doggo = new Animal("Sharik", 11);
        Animal bird = new Animal("Kesha", 1);
        Animal turtle = new Animal("Tartila", 150);

        HashSet<Animal> animals = new HashSet<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(doggo);
        animals.add(bird);
        animals.add(turtle);

        for(Animal a : animals) {
            log.info(a);
        }
    }

}
