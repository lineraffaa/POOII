package POOII.CollectionsFrameworkII;

import java.util.*;

public class Exercicio4 {

    public static void main(String[] args) {
        char[] chrs = { 'V', 'J', 'L', 'E', 'E' };
        // Cria um conjunto de �rvore e um conjunto hash.
        TreeSet<Character> ts = new TreeSet<Character>();
        HashSet<Character> hs = new HashSet<Character>();
        System.out.print("Conte�do de chrs:      ");
        for (char ch : chrs)
            System.out.print(ch + "  ");
        System.out.println();
        // Primeiro, adiciona os caracteres ao conjunto hash.
        for (char ch : chrs)
            hs.add(ch);
        System.out.println("Conte�do do conjunto hash: " + hs);
        // Em seguida, adiciona os caracteres ao conjunto da �rvore.
        for (char ch : chrs)
            ts.add(ch);
        System.out.println("Conte�do do conjunto de �rvore: " + ts);
    }
    // tree constroi os elementos em ordem decrecente, a hesh gera de acordo com a
    // hash,
}
