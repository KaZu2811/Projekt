import java.util.Random;

/**
 * Klasa Zloto dziedziczy po klasie Przedmioty
 * Zawiera metode dodajZloto() oraz nextInt()
 */
public class Zloto {
    private static int dodawaneZloto = 25;
    /**
     * Metoda dodajZloto() zmienia liczbe zlota zdobytego przez rycerza
     * @return Rycerz.liczbaZlota liczba zdobytego przez rycerza zlota
     */
    public static int dodajZloto()
    {
        Rycerz.liczbaZlota= Rycerz.liczbaZlota + dodawaneZloto;
        return Rycerz.liczbaZlota;
    }
    /**
     * Metoda nextInt generuje losowe położenie na planszy zlota
     * @return pozycja liczba okreslajaca pozycje zlota na planszy
     */
    public int nextInt() {
        Random los = new Random();
        int pozycja = los.nextInt(Plansza.rp());
        return pozycja;

    }
}