package dev.kata.parrot.models;

import dev.kata.parrot.factory.ParrotCreator;

public enum ParrotType {
        EUROPEAN(      (numberOfCoconuts, voltage, nailed) -> new EuropeanParrot()),
        AFRICAN(       (numberOfCoconuts, voltage, nailed) -> new AfricanParrot(numberOfCoconuts)),
        NORWEGIAN_BLUE( (numberOfCoconuts, voltage, nailed) -> new NorwegianBlueParrot(voltage, nailed));

        private final ParrotCreator creator;

        ParrotType(ParrotCreator creator) {
            this.creator = creator;
        }

        public ParrotSpecies create(int numberOfCoconuts, double voltage, boolean isNailed) {
            return creator.create(numberOfCoconuts, voltage, isNailed);
        }
}
