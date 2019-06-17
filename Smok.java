import java.util.Random;

/**
 * Klasa Smok dziedziczy po klasie Potwory
 * Implementuje metode atak() zawarta w klasie Potwory
 * Zawiera metode nextInt()
 */
public class Smok extends Potwory {
    /**
     * Konstruktor Smok() nadpisuje zmienna zabieraneHP
     * @param zabieraneHP liczba punktow Hp odejmowanych rycerzowi
     */
    public Smok (int zabieraneHP)
    {
        super(zabieraneHP);
    }

/**
     * Metoda netxInt generuje losowe miejsce na planszy obiektu klasy Smok
     * @return pozycja aktualna pozycja obiektu
     */
public int nextInt() {
    Random los = new Random();
    int pozycja = los.nextInt(Plansza.rp());
    return pozycja;
}
}