import java.util.Random;

/**
 * Klasa SkrzyniaSkarbow dziedziczy po klasie Przedmioty
 * Zawiera metode zakonczW() i nextInt()
 */
public class SkrzyniaSkarbow {
    private static int zdobytySkarb = 1;
    /**
     * Metoda zakonczW() dodaje do zmiennej skarb zdobyty prez rycerza skarb
     * @return Rycerz.skarb zmienna okreslajaca liczbe skrzyni skarbow zdobytej przez rycerza
     */
    public static int dodajSkarb ()
    {
        Rycerz.skarb = Rycerz.skarb + zdobytySkarb;
        return Rycerz.skarb;
    }
    /**
     * Metoda nextInt generuje losowe położenie na planszy skrzyni skarbow
     * @return pozycja liczba okreslajaca pozycje skrzyni skarbow na planszy
     */
    public int nextInt() {
        Random los = new Random();
        int pozycja = los.nextInt(Plansza.rp());
        return pozycja;

    }
}
