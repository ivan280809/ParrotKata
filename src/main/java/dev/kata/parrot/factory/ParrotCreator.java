package dev.kata.parrot.factory;

import dev.kata.parrot.models.ParrotSpecies;

@FunctionalInterface
public interface ParrotCreator {
    ParrotSpecies create(int numberOfCoconuts, double voltage, boolean isNailed);
}
