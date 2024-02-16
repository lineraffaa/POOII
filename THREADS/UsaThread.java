package POOII.THREADS;

public class UsaThread {
    public static void main(String[] args) {
        System.out.println("Thread principal iniciando.");
        mythread mt = new mythread("Filha #1");
        mythread mt2 = new mythread("Filha 2");
        mythread mt3 = new mythread("Filha 3");
        Thread newThrd = new Thread(mt);
        Thread newThrd2 = new Thread(mt2);
        Thread newThrd3 = new Thread(mt3);

        newThrd.start();
        newThrd2.start();
        newThrd3.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Thread principal interrompida.");
            }
        }
        System.out.println("Thread principal finalizando.");
    }
}
