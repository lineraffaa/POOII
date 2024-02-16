package POOII.THREADS;

public class Usacesta {
    public static void main(String[] args) {
        CestaFruta cesta = new CestaFruta("Cesta de Frutas");
        Thread newThread = new Thread(cesta);
        newThread.start();
    }
}
