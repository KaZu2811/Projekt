/**
 * Klasa abstrakcyjna Przeciwnicy, po ktorej dziedzicza klasy Potwory i Wrogowie
 * Zawiera deklaracje metody nextInt()
 */

public abstract class Przeciwnicy  {
    /**
     * Deklaracja metody nextInt ktora generuje losowe miejsce na planszy obiektow
     * @return pozycja aktualna pozycja obiektow
     */
    public abstract int nextInt();
}
