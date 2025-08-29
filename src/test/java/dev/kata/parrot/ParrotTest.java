package dev.kata.parrot;

import dev.kata.parrot.factory.ParrotFactory;
import dev.kata.parrot.models.AfricanParrot;
import dev.kata.parrot.models.NorwegianBlueParrot;
import dev.kata.parrot.models.ParrotSpecies;
import dev.kata.parrot.models.ParrotType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }
    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getCryOfEuropeanParrot() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.EUROPEAN, 0, 0, false);
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    public void getCryOfAfricanParrot() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.AFRICAN, 1, 0, false);
        assertEquals("Sqaark!", parrot.getCry());
    }
    @Test
    public void getCryOfNorwegianBlueHighVoltage() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueNoVoltage() {
        ParrotSpecies parrot = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 0, false);
        assertEquals("...", parrot.getCry());
    }

    @Test
    void africanParrot_rejects_negative_coconuts() {
        assertThrows(IllegalArgumentException.class,
                () -> new AfricanParrot(-1));
    }

    @Test
    void norwegianBlue_rejects_negative_voltage_constructor() {
        assertThrows(IllegalArgumentException.class,
                () -> new NorwegianBlueParrot(-0.1, false));
    }

    @Test
    void factory_rejects_null_type() {
        assertThrows(NullPointerException.class,
                () -> ParrotFactory.createParrotSpecie(null, 0, 0.0, false));
    }
}