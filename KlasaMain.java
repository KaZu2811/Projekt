import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Klasa KlasaMain implementuje interfejs ISymulacja
 * Zawiera pola okreslajace obiekty, konstruktor KlasaMain oraz implementuje metode rozpocznij() z interfejsu ISymulacja
 */
public class KlasaMain implements ISymulacja {
    /**
     * Pola okreslajace obiekty, tablica reprezentujaca ich polozenie na planszy
     */
    private  int [] obiekty = new int [12];
    private Rycerz r1;
    private Zloto z1;
    private Zloto z2;
    private Zloto z3;
    private EliksirZycia e1;
    private EliksirZycia e2;
    private EliksirZycia e3;
    private SkrzyniaSkarbow s1;
    private Potwory d1;
    private Wrogowie w1;
    private Potwory o1;
    private Potwory o2;
    private Potwory o3;

    /**
     * Konstrukto KlasaMain inicjalizuje pola z KlasyMain oraz przypisuje do tablicy obiekty[] losowe miejsce na planszy
     * Okresla takze poczatkowe: punkty HP, liczbe ruchow, liczbe zlota oraz pozycje rycerza
     * @throws FileNotFoundException brak wyjatkow
     */
    public KlasaMain() throws FileNotFoundException {
        this.r1 = new Rycerz ();
        this.z1 = new Zloto ();
        this.z2 = new Zloto ();
        this.z3 = new Zloto ();
        this.e1 = new EliksirZycia ();
        this.e2 = new EliksirZycia ();
        this.e3 = new EliksirZycia ();
        this.s1 = new SkrzyniaSkarbow ();
        this.d1 = new Smok (30);
        this.w1 = new Wrogowie ();
        this.o1 = new Potwory (20);
        this.o2 = new Potwory (20);
        this.o3 = new Potwory (20);
        obiekty[0] = z1.nextInt();
        obiekty[1] = z2.nextInt();
        obiekty[2] = z3.nextInt();
        obiekty[3] = e1.nextInt();
        obiekty[4] = e2.nextInt();
        obiekty[5] = e3.nextInt();
        obiekty[6] = s1.nextInt();
        obiekty[7] = w1.nextInt();
        obiekty[8] = d1.nextInt();
        obiekty[9] = o1.nextInt();
        obiekty[10] = o2.nextInt();
        obiekty[11] = o3.nextInt();
        r1.liczbaHP=100;
        r1.liczbaRuchow=0;
        r1.liczbaZlota=0;
        r1.pozycja = 0;
    }

    /**
     * Metoda rozpocznij() umozliwia przebieg symulacji
     * Zawiera petle w ktorej wykonuja sie kolejne kroki symulacji
     * Metoda inkrementuje liczbe ruchow rycerza, wywoluje metode interkcja(), zmienia pozycje rycerza na planszy oraz sprawdza czy nie zaszly warunki konczace symulacje
     * NAstepuje tu tez zapis kolejnych krokow symulacji do pliku
     */
    public void rozpocznij() throws FileNotFoundException {
        PrintWriter zapis= new PrintWriter("zapis1.txt");
        do {
            r1.liczbaRuchow++;
            r1.interakcja(d1, o1, r1.pozycja, this.obiekty);
            r1.pozycja++;
            zapis.println("Liczba ruchow: " +Rycerz.liczbaRuchow);
            zapis.println("Liczba zlota: " +Rycerz.liczbaZlota);

            if (r1.liczbaHP <= 0) {
                System.out.println("Koniec symulacji, rycerz zginal");
                System.out.println("Liczba zdobytego zlota: " + r1.liczbaZlota);
                System.out.println("Liczba wykonanych ruchow: " + r1.liczbaRuchow);
                break;
            }
            if (r1.skarb == 1) {
                System.out.println("Koniec symulacji rycerz zdobyl skrzynie skarbow");
                System.out.println("Liczba zdobytego zlota: " + r1.liczbaZlota);
                System.out.println("Liczba wykonanych ruchow: " + r1.liczbaRuchow);
                break;
            }
        } while (r1.liczbaHP >= 0);
        zapis.close();
    }
}
