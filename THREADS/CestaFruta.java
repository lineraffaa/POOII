package POOII.THREADS;

import java.lang.reflect.Array;
import java.util.*;

public class CestaFruta implements Runnable {
    private String nomeThread;

    public CestaFruta(String name) {
        nomeThread = name;
    }

    public void run() {

        String[] fruta = { "uva", "morango", "banana", "cereja" };

        List<String> frutas = new ArrayList<String>(Arrays.asList(fruta));

        System.out.println(nomeThread + " iniciando.");

        for (String f : frutas) {
            System.out.println(f);
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException exc) {
            System.out.println(nomeThread + " interrompida.");
        }
        System.out.println(nomeThread + " terminando.");

    }
}
