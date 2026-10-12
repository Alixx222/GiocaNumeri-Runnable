package giocanumeri;
public class Giocatore extends Thread {

    String nome;
    int punteggio;
    String parola;

    /**
     * Crea un giocatore
     */
    public Giocatore(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }


    void gioca() {

        int numero = 19;
        parola = "Buongiorno";

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore " + nome + ": " + i);

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.err.println(
                        "Errore durante la sospensione del thread"
                );
            }
        }

        punteggio = 10;
    }


    void comunica() {
        System.out.println(
                "Giocatore " + nome
                        + " - punteggio: " + punteggio
                        + " - parola scelta: " + parola
        );
    }


    @Override
    public void run() {
        gioca();
        comunica();
    }
}
