public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria bc = new ContaBancaria(1000);
        Pessoa p1 = new Pessoa(bc);
        Pessoa p2 = new Pessoa(bc);

        try {
            p1.thread().join();
            p2.thread().join();
        } catch (InterruptedException exc) {
            System.out.println("Thread principal interrompida.");
        }
    }

}
