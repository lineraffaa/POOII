package POOII.THREADS;

public class mythread implements Runnable {
    private String nomeThread;

    public mythread(String name) {
        nomeThread = name;
    }

    public void run() {
        System.out.println(nomeThread + " iniciando.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Em " + nomeThread + ", contagem é " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(nomeThread + " interrompida.");
        }
        System.out.println(nomeThread + " terminando.");
    }
}