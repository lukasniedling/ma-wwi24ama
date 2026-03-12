package de.dhbw.exercise.classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static de.dhbw.commons.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ClassesExerciseTest {

    @Test
    @DisplayName(
             """
             Erstelle Klassen im Paket "src/main/java/de/dhbw/exercise/classes"
             1. Erstelle eine neue Klasse Fernzug mit einem parameterlosen Konstruktor
             2. Erstelle eine neue Klasse Regionalzug mit einem parameterlosen Konstruktor
             Teste, ob die Instanzen korrekt erzeugt wurden!
            """)
    public void exercise1() {
        fernzug f = new fernzug();
        regionalzug r = new regionalzug();

        // then
        assertNotNull(f, "Fernzug sollte instanziiert sein");
        assertNotNull(r, "Regionalzug sollte instanziiert sein");
    }

    @Test
    @DisplayName(
            """
            Ergänze die Klasse 'Zug' mit einem Feld namens "number". Erzeuge eine Instanz und
            teste für die Instanz, welchen Wert dieses Feld einer Instanz hat!
            """)
    public void exercise2() {
            // given
            fernzug meinZug = new fernzug();

            // when
            String initialValue = meinZug.number;

            // then
            // Bei Objektreferenzen (String) ist der Standardwert null
            assertNull(initialValue, "Das Feld 'number' sollte initial null sein");

            meinZug.number = "ICE 123";
            assertEquals("ICE 123", meinZug.number);
    }

    @Test
    @DisplayName(
            """
            Erzeuge eine
              1. konkrete Klasse `Person` mit einem Attribut `name`, erstelle dann
              2. die zum Attribut gehörende `get` und `set` Methode,
              3. erstelle dann die `equals()` und `hashCode()` Methoden durch Code Generierung,
              4. (optional) leite aus dieser konkreten Klasse ein Interface `Mensch` ab
            """)
    public void exercise3() {
        // given

        // when

        // then
    }

}