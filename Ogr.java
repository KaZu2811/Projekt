import java.util.Random;

/**
 * Klasa Ogr zawiera implementacje metody atak() z klasy Potwory, po ktorej dziedziczy
 */
 class Ogr extends Potwory {
    private int zabieraneZloto = 15;

    public Ogr (int zabieraneHP)

    {
        super(zabieraneHP);
    }
    /**
     * Metoda atak() zmniejsza liczbe zlota rycerza
     *
     * @return Rycerz.liczbaZlota aktualna liczba punktow zlota rycerza
     */
    public int atak()
    {
        super.atak();
        Rycerz.liczbaZlota = Rycerz.liczbaZlota - zabieraneZloto;
        return Rycerz.liczbaZlota;
    }
    /**
     * Metoda netxInt generuje losowe miejsce na planszy obiektow klasy Ogr
     * @return pozycja aktualna pozycja obiektow
     */
    public int nextInt() {
        Random los = new Random();
        int pozycja = los.nextInt(Plansza.rp());
        return pozycja;
    }
}