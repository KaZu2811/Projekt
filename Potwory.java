import java.util.Random;

/**
 * Klasa Potwory to klasa abstrakcyjna dziedziczaca po klasie Przeciwnicy
 * Zawiera metode atak() oraz konstruktor Potwory()
 */
public class Potwory extends Przeciwnicy
{
   private int zabieraneHP;
    /**
     * Deklaracja metody atak()
     * @return Rycerz.liczbaHP  liczba punktow HP rycerza
     */
    public int nextInt() {
        Random los = new Random();
        int pozycja = los.nextInt(Plansza.rp());
        return pozycja;

    }
    /**
     * Metoda atak() odejmuje odpowiednia liczbe HP rycerzowi
     * @return Rycerz.liczbaHP aktualna liczba HP rycerza
     */
    public int atak()
     {
         Rycerz.liczbaHP = Rycerz.liczbaHP - zabieraneHP;
         return Rycerz.liczbaHP;
     }

    /**
     * Konstruktor Potwory() przypisuje wartosc zabieraneHP
     * @param zabieraneHP liczba odejmowanych rycerzowi punktow HP
     */
     public Potwory (int zabieraneHP)
     {
         this.zabieraneHP = zabieraneHP;

     }
}
