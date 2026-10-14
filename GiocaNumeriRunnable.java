package giocanumerirunnable;

/**
 *
 * @author alice carletti
 */
public class GiocaNumeriRunnable {

    public static void main(String[] args) {

        System.out.println("INIZIO GIOCO");

        Giocatore g1 = new Giocatore("Alice", 0);
        Thread t1 = new Thread(g1);
        t1.start();

        Giocatore g2 = new Giocatore("Greta", 0);
        Thread t2 = new Thread(g2);
        t2.start();



        long startTime = System.currentTimeMillis();
        int count = countPrimes(2, 5000000);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Thread" + id + "counted" +
                count + "primes in" + (elapsedTime/1000.0) + "seconds." );


        System.out.println("FINE GIOCO");
    }
}
