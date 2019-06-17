import java.util.Random;

/**
 * Klasa Wrogowie dziedziczy po klasie Przeciwnicy
 * Zawiera metody zakonczP() i nextInt()
 */
public class Wrogowie extends Przeciwnicy {
    /**
     * Metoda zakonczP zmienia liczbe punktow HP rycerza, prowadzac do zakonczenia symulacji
     * @return Rycerz.liczbaHP
     */
    public static int zakoncz()
    {
        Rycerz.liczbaHP = 0;
        return Rycerz.liczbaHP;
    }

    /**
     * Metoda netxInt generuje losowe miejsce na planszy obiektu klasy Wrogowie
     * @return pozycja aktualna pozycja obiektu
     */
    public int nextInt() {
        Random los = new Random();
        int pozycja = los.nextInt(Plansza.rp());
        return pozycja;

    }
}