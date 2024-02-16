package POOII.CollectionsFrameworkII;

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] cores = { "preto", "amarelo", "verde", "azul", "branco" };
        List<String> list1 = new LinkedList<>(Arrays.asList(cores));
        PrintList(list1);
        String[] cores2 = { "dourado", "prata", "marron", "cinza" };
        List<String> list2 = new LinkedList<>(Arrays.asList(cores2));
        PrintList(list2);
        // Continue a implementação. . .
    }

    public static void PrintList(List<String> l) {
        for (String elemento : l) {
            System.out.println(elemento);

        }
    }
}