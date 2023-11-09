import jdk.jfr.Experimental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void dla_pustego_stringa_zwraca_zero_kiedy_null() {
        // Given
        String dane = null;
        Integer oczekiwanyWynik = 0;
        Kalkulator kalkulator = new Kalkulator();

        Integer wynik = null;
        // When

        try {
             wynik = kalkulator.dodaj(dane);
            fail();
        } catch (NullPointerException ex) {
           // assertTrue(true);
            // then
            assertEquals("Cannot invoke \"String.isEmpty()\" because \"dane\" is null", ex.getMessage());
        }

        // Then
        //assertEquals(oczekiwanyWynik, wynik);


    }

    @Test
    void dla_pustego_stringa_zwraca_zero() {
        // Given
        String dane = "";
        Integer oczekiwanyWynik = 0;
        Kalkulator kalkulator = new Kalkulator();

        // When

        Integer wynik = kalkulator.dodaj(dane);

        // Then
        assertEquals(oczekiwanyWynik, wynik);

    }

    @Test
    void pozwala_dodawac_liczby_oddzielone_przecinkiem() {
        // Given
        String dane = "1,2,3,4,1";
        Integer oczekiwanyWynik = 11;
        Kalkulator kalkulator = new Kalkulator();

        // When
        Integer wynik = kalkulator.dodaj(dane);

        // Then
        assertEquals(oczekiwanyWynik, wynik);

    }

    @Test
    void pozwala_dodawac_liczby_oddzielone_enterem() {
        // Given
        String dane = "1\n2\n3";
        Integer oczekiwanyWynik = 6;
        Kalkulator kalkulator = new Kalkulator();

        // When
        Integer wynik = kalkulator.dodaj(dane);

        // Then
        assertEquals(oczekiwanyWynik, wynik);

    }

    @Test
    void pozwala_dodawac_wlasny_separator() {
        // Given
        String dane = "//@\n1@2@3";
        Integer oczekiwanyWynik = 6;
        Kalkulator kalkulator = new Kalkulator();

        // When
        Integer wynik = kalkulator.dodaj(dane);

        // Then
        assertEquals(oczekiwanyWynik, wynik);

    }


}