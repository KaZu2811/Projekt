import java.util.Random;

/**
 * Klasa EliksirZycia dziedziczy po klasie Losowo
 * Znajduje sie w niej metoda dodajaca punkty HP rycerzowi
 */

public class EliksirZycia  {
    private static int dodawaneHP = 15;
    /**
     * Metoda dodajHP dodaje punkty HP rycerzowi
     * @return Rycerz.liczbaHP liczba punktów HP rycerza
     */
    public static int dodajHP()
    {
        if(Rycerz.liczbaHP<=85)
        Rycerz.liczbaHP = Rycerz.liczbaHP + dodawaneHP;
        return Rycerz.liczbaHP;
    }

    /**
     * Metoda nextInt generuje losowe położenie na planszy eliksiru zycia
     * @return pozycja liczba okreslajaca pozycje eliksiru zycia na planszy
     */
    public int nextInt() {
        Random los = new Random();
      int pozycja = los.nextInt(Plansza.rp());
        return pozycja;
    }

}
