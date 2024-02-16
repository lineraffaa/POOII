package POOII.CollectionsFrameworkII;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] cores = { "vermelho", "branco", "azul", "verde", "cinza",
                "laranja", "laranja", "cinza", "vermelho" };

        List<String> list = new ArrayList<>(Arrays.asList(cores));
        TreeSet<String> ts = new TreeSet<String>(Arrays.asList(cores));
        HashSet<String> hs = new HashSet<String>(Arrays.asList(cores));
        
        printCollection(list); 
        printCollection(hs);
        printCollection(ts);
    }

    public static void printCollection(Collection<String> c) {
        for (String elemento : c) {
            System.out.println(elemento);
        }

    }
}