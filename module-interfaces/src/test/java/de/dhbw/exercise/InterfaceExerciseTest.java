package de.dhbw.exercise;

import de.dhbw.exercise.abstracts.Regionalzug;
import de.dhbw.exercise.abstracts.Zug;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static de.dhbw.commons.Assertions.assertEquals;

public class InterfaceExerciseTest {

    @Test
    @DisplayName("""
       Übung 1: Interface & Realisierung - Erzeuge folgende Klassen:
    
       1. Eine Schnittstelle `Zug` mit den Schnittstellenmethoden
        a) `getNumber` (soll den Wert des Feldes `number` vom Typ `String` zurückgeben) sowie
        b) `setNumber` (soll den Wert des Feldes `number` setzen)
       2. Eine Klasse `Regionalzug`, die das Interface `Zug` realisiert
       3. Nutze diesen Test, setze eine Zugnummer, hole diese wieder und teste den Wert auf Gleichheit
    """)
    public void exercise1() {
        // given
        Zug testzug = new Regionalzug();
        String geplanteNummer = "12345";
        // when
        testzug.setNumber(geplanteNummer);
        // then
        assertEquals(geplanteNummer, testzug.getNumber());


    }

}
