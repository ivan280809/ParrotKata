package dev.kata.parrot.factory;

import dev.kata.parrot.models.*;

public class ParrotFactory {

    public static ParrotSpecies createParrotBehaviour(ParrotType type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }
}
