package POOII.ThreadsIII;

public class TiqueTaque {
    String estado; // estado do rel�gio

    public synchronized void tique(boolean running) {
        if (!running) { // desliga o rel�gio
            estado = "tiqueOff";
            // notifica a thread que est� esperando
            return;
        }
        System.out.print("Tique ");
        estado = "tiqueOff"; // define o estado atual com tiqueOff
         // permite que taque() seja executado, tique() notifica
                  // taque()
        try {
            while (estado.equals("tiqueOff"))
                
        } catch (InterruptedException exc) {
            System.out.println("Thread interrompida.");
        }
    }

    public synchronized void taque(boolean running) {
        if (!running) { // desliga o rel�gio
            estado = "taqueOff";
             // notifica a thread que est� esperando
            return;
        }
        System.out.println("Taque");
        estado = "taqueOff"; // define o estado atual com taqueOff
         // permite que tique() seja executado, taque() notifica
                  // tique()
        try {
            while (estado.equals("taqueOff"))
            
        } catch (InterruptedException exc) {
            System.out.println("Thread interrompida.");
        }
    }
}
