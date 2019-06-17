import java.util.Scanner;

/**
 * Klasa Plansza deklaruje zmienna rozmiarPlanszy oraz zawiera metode ustalRozmiar()
 */
public class Plansza {
    public static int rozmiarPlanszy;

    /**
     * Metoda ustalRozmiar() nadaje zmiennej rozmiarPlanszy wartosc podana z klawiatury przez aktora
     *
     * @return rozmiarPlanszy liczba okreslajaca rozmiar Planszy
     */
    public static int ustalRozmiar() {
        System.out.println("Podaj rozmiar planszy:");
        Scanner odczyt = new Scanner(System.in);
        Plansza.rozmiarPlanszy = odczyt.nextInt();
        if (Plansza.rozmiarPlanszy > 0) {
            return Plansza.rozmiarPlanszy;
        } else {
            Plansza.rozmiarPlanszy = 0;
            return Plansza.rozmiarPlanszy;
        }
    }
    public static int rp()
    {
        return rozmiarPlanszy;
    }
}