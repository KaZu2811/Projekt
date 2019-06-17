import java.io.FileNotFoundException;

/**
 * Klasa Main zawiera metode main rozpoczynajaca symulacje
 * Dziedziczy po klasie Losowo
 */
class Main {

    /**
     * Metoda main to glowna metoda programu umozliwiajaca jego dzialanie
     * Wywoluje metody ustalRozmiar() i rozpocznij() oraz tworzy obiekt KlasyMain
     * @param args parametr potrzebny do dzialania metody main
     * @throws FileNotFoundException brak wyjatkow
     */
        public static void main (String[]args) throws FileNotFoundException {
            Plansza.ustalRozmiar();
            int rozmiarPlanszy = Plansza.rozmiarPlanszy;
            if (rozmiarPlanszy==0)
            {
                System.out.println("Rozmiar planszy musi byc dodatni");
            }
            else {
                KlasaMain symulacja = new KlasaMain();
                symulacja.rozpocznij();
            }
        }
}
