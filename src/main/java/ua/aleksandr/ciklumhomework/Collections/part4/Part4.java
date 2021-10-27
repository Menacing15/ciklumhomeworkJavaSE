package ua.aleksandr.ciklumhomework.Collections.part4;

import org.apache.log4j.Logger;
import ua.aleksandr.ciklumhomework.Collections.part3.Part3;

import java.util.*;

public class Part4 {

    static Logger log = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        log.info("List one: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        log.info("List two: " + list2);

        list1.addAll(list2);
        log.info("List one after addAll: " + list1);

        list1.removeAll(list2);
        log.info("List one after removeAll: " + list1);

        log.info("List two: " + list2 + " contains value 6:" + list2.contains(6));
        log.info("List two: " + list2 + " contains value 7:" + list2.contains(7));

        list1.clear();
        log.info("List one after clear: " + list1);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(7);

        log.info("List two " + list2 + " list three: " + list3);
        list3.retainAll(list2);
        log.info("List three after retainAll using list two: " + list3);

        log.info("Is list one: " + list1 + " empty? " + list1.isEmpty());

        HashSet<Integer> set = new HashSet<>();
        set.add(1337);
        set.add(17);
        set.add(666);
        set.add(69);
        set.add(8);

        List<Integer> list4 = new ArrayList<>(set);
        log.info("List based on hash set " + list4);

        Collections.sort(list4);
        log.info("Using Collections.sort on a list " + list4);


        HashSet<String> set2 = new HashSet<>();
        set2.add("just");
        set2.add("some");
        set2.add("strings");
        set2.add("highxshoo");

        List<String> list5 = new ArrayList<>(set2);
        log.info("List based on hash set " + list5);

        Collections.sort(list5);
        log.info("Using Collections.sort on a list " + list5);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shoo", 20000, "Music & Programming"));
        employees.add(new Employee("Tara", 20000, "Football"));
        employees.add(new Employee("Peep", 80000, "Music"));

        log.info("Unsorted employees " + employees);
        Collections.sort(employees);
        log.info("Sorted employees " + employees);
    }
}
