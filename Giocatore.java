package giocanumerirunnable;

public class Giocatore implements Runnable {

    String nome;
    int punteggio;
    String parola;

    public Giocatore (String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }

    void gioca() {
        int numero = 19;
        parola = "BUONGIORNO";

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore " + nome + ": " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Errore");
            }
        }

        punteggio = 10;
    }

    void comunica() {
        System.out.println("Giocatore " + nome + ": "
                + punteggio + " ha scelto la parola: " + parola);
    }


    @Override
    public void run() {
        thread.start();
        System.out.println("ID: " + thread.getName());
        System.out.println("Stato: " + thread.getState());
        System.out.println("Priorità: " + thread.getPriority());
        System.out.println("Attivo: " + thread.isAlive());
        thread.interrupt();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedExeption e) {
            e.printStackTrace();
            System.out.println("ID: " + thread.getName());
            System.out.println("Stato: " + thread.getState());
            System.out.println("Priorità: " + thread.getPriority());
            System.out.println("Attivo: " + thread.isAlive());
        }


        gioca();
        comunica();
    }
}
