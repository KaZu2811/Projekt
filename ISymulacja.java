import java.io.FileNotFoundException;

/**
 * Interfejs zawierajacy deklaracje metody rozpocznij()
 */

public interface ISymulacja
{
    /**
     * Deklaracja metody rozpocznij, ktora uruchamia symulacje
     * @throws FileNotFoundException brak wyjatkow
     */
    void rozpocznij() throws FileNotFoundException;
}
