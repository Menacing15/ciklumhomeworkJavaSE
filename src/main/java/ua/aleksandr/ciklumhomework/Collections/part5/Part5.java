package ua.aleksandr.ciklumhomework.Collections.part5;

import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Part5 {
    static Logger log = Logger.getLogger(Part5.class.getName());

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Phonk", "Phonk is a subgenre of hip hop and trap music directly inspired by 1990s Memphis rap.");
        map.put("Hyperpop", "Hyperpop is a loosely-defined music movement and microgenre characterized by a maximalist or exaggerated take on popular music.");
        map.put("Emo rap", "Emo rap is a fusion genre of hip hop and emo. " +
                "The genre fuses characteristics of hip hop music, such as beats and rapping," +
                " with the lyrical themes, instrumentals, and vocals commonly found in emo music.");

        log.info("Simple HashMap: ");
        for(String s : map.keySet()) {
            log.info(s + " - " + map.get(s));
        }

        log.info("\n");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            log.info(entry.getKey() + " - " + entry.getValue());
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Phonk", "Phonk is a subgenre of hip hop and trap music directly inspired by 1990s Memphis rap.");
        treeMap.put("Hyperpop", "Hyperpop is a loosely-defined music movement and microgenre characterized by a maximalist or exaggerated take on popular music.");
        treeMap.put("Emo rap", "Emo rap is a fusion genre of hip hop and emo. " +
                "The genre fuses characteristics of hip hop music, such as beats and rapping," +
                " with the lyrical themes, instrumentals, and vocals commonly found in emo music.");


        log.info("\nTree map: ");

        for(String s : treeMap.keySet()) {
            log.info(s + " - " + treeMap.get(s));
        }

        treeMap.put("Emo rap", "best genre");

        log.info("\n");

        for(Map.Entry<String, String> entry : treeMap.entrySet()) {
            log.info(entry.getKey() + " - " + entry.getValue());
        }
    }
}
