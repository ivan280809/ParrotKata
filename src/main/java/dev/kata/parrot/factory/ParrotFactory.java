package dev.kata.parrot.factory;

import dev.kata.parrot.models.*;

import java.util.Objects;

public class ParrotFactory {

    public static ParrotSpecies createParrotSpecie(ParrotType type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Objects.requireNonNull(type, "type must not be null");
        return type.create(numberOfCoconuts, voltage, isNailed);
    }
}
