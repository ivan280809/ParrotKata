package dev.kata.parrot.factory;

import dev.kata.parrot.models.*;

public class ParrotFactory {

    public static ParrotSpecies createParrotSpecie(ParrotType type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return type.create(numberOfCoconuts, voltage, isNailed);
    }
}
