package ua.aleksandr.ciklumhomework.Collections.part1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;

public class Part1 {
    static Logger log = Logger.getLogger(Part1.class.getName());

    public static void main(String[] args) {

        ArrayList objList = new ArrayList();
        objList.add("String");
        objList.add(1337);
        objList.add(666);
        objList.add(4.20);
        objList.add('$');

        String working = (String) objList.get(0);
        //String compileError = (String) objList.get(1);

        int first = (int)objList.get(1);
        int second = (int)objList.get((2));
        log.info("Casting and adding two numbers from objList: "  + first + " + " + second + " = " + (first + second));

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Amen");
        String result = stringList.get(0);
        log.info("Getting first element from list of strings: " + result);

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(69);
        integerLinkedList.add(666);
        integerLinkedList.add(1337);

        for(int i : integerLinkedList) {
            log.info("Value in linked list of integers: " + i);
        }

        integerLinkedList.remove();

        for(int i : integerLinkedList) {
            log.info("Value in linked list of integers: " + i);
        }
    }
}
