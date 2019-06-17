/**
 * Interfejs IRycerz zawiera deklaracje metody interakcja
 */
public interface IRycerz
{
    /**
     * Deklaracja metody interakcja
     * @param o1 obiekt Ogr z klasy Potwory
     * @param d1 obiekt Smok z klasy Potwory
     * @param pozycja aktualna pozycja rycerza na planszy
     * @param obiekty tablica zawierajaca pozycje zajmowane na planszy przez pozostale obiekty
     */
    void interakcja( Potwory o1, Potwory d1, int pozycja, int obiekty[]);
}
