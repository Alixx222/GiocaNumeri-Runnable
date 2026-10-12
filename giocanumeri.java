package giocanumeri;

/**
 * @see UdA n. 1 Esercitazione n. 1 GiocaNumeri
 * @author alice carletti
 */
public class GiocaNumeriRunnable {

    public static void main(String[] args) {

        System.out.println("INIZIO GIOCO");

        GiocatoreRunnable g1 = new GiocatoreRunnable("Alice", 0);
        Thread t1 = new Thread(g1);
        t1.start();

        GiocatoreRunnable g2 = new GiocatoreRunnable("Greta", 0);
        Thread t2 = new Thread(g2);
        t2.start();

        System.out.println("FINE GIOCO");
    }
}
