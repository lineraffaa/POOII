package POOII.TreeMap;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("Jonas", 122.34);
        tm.put("Carlos", 12.2);
        tm.put("Carol", 10.22);
        tm.put("Rafa", 12.23);
        tm.put("Ane", 133.3);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
