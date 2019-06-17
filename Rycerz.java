/**
 * Klasa Rycerz implementuje interfejs IRycerz
 * Deklaruje zmienne skarb, liczbaHP, liczbaZlota, liczbaRuchow, pozycja, ktore okreslaja cechy rycerza
 * Zawiera metode interakcja() ktora okresla dzialanie obiektow w czasie trwania symulacji
 */
public class Rycerz implements IRycerz {
    static int skarb;
    static int liczbaHP;
    static int liczbaZlota;
    static int liczbaRuchow;
    public int pozycja;

    /**
     * Metoda interakcja() wywoluje odpowiednie metody w zaleznosci od tego z jakim obiektem rycerz wchodzi w interakcje
     * @param o1 obiekt Ogr z klasy Potwory
     * @param d1 obiekt Smok z klasy Potwory
     * @param pozycja liczba reprezentujaca aktualna pozycje rycerza
     * @param obiekty tablica zawierajaca pozycje zajmowane na planszy przez pozostale obiekty
     */
    public void interakcja(Potwory o1, Potwory d1, int pozycja, int[] obiekty) {
        for (int i = 0; i < 3; i++) {
            if (pozycja == obiekty[i]) {
                Zloto.dodajZloto();
                break;
            }
        }
        for (int k = 3; k < 6; k++) {
            if (pozycja == obiekty[k]) {
                EliksirZycia.dodajHP();
                break;
            }
        }
        for (int j = 9; j < 12; j++) {
            if (obiekty[j] == pozycja) {
                o1.atak();
                break;
            }
        }
        if (pozycja == obiekty[6]) {
            SkrzyniaSkarbow.dodajSkarb();
        }
        if (pozycja == obiekty[7]) {
            Wrogowie.zakoncz();
        }
        if (pozycja == obiekty[8]) {
            d1.atak();
        }
    }
}



