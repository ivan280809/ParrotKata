package dev.kata.parrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    @Test
    void europeanParrot_hasBaseSpeed() {
        Parrot parrot = new Parrot(ParrotType.EUROPEAN, 0, 0.0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.01);
    }

    @Test
    void africanParrot_withNoCoconuts() {
        Parrot parrot = new Parrot(ParrotType.AFRICAN, 0, 0.0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.01);
    }

    @Test
    void africanParrot_withOneCoconut() {
        Parrot parrot = new Parrot(ParrotType.AFRICAN, 1, 0.0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.01);
    }

    @Test
    void africanParrot_withTwoCoconuts() {
        Parrot parrot = new Parrot(ParrotType.AFRICAN, 2, 0.0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.01); // no puede ser negativo
    }

    @Test
    void norwegianBlueParrot_nailed() {
        Parrot parrot = new Parrot(ParrotType.NORWEGIAN_BLUE, 0, 2.0, true);
        assertEquals(0.0, parrot.getSpeed(), 0.01);
    }

    @Test
    void norwegianBlueParrot_notNailed_withLowVoltage() {
        Parrot parrot = new Parrot(ParrotType.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.01);
    }

    @Test
    void norwegianBlueParrot_notNailed_withHighVoltage_cappedAt24() {
        Parrot parrot = new Parrot(ParrotType.NORWEGIAN_BLUE, 0, 3.0, false);
        assertEquals(24.0, parrot.getSpeed(), 0.01);
    }
}
