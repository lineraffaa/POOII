public class Pessoa implements Runnable {
    Thread thread;
    ContaBancaria bc = new ContaBancaria(200);

    public Pessoa(ContaBancaria s) {
        this.thread = new Thread(this);
        this.bc = s;
        thread.start();
    }

    public void run() {
        synchronized (this.bc) {
            for (int i = 0; i < 10; i++) {

                System.out.println("Saque");

                bc.saque(200);

                System.out.println("Deposito");

                bc.deposito(200);

                System.out.println(bc.getSaldo());

            }
        }
    }

    public Thread thread() {
        return thread;
    }

}
