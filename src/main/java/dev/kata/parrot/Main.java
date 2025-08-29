package dev.kata.parrot;

import dev.kata.parrot.factory.ParrotFactory;
import dev.kata.parrot.models.ParrotSpecies;
import dev.kata.parrot.models.ParrotType;

public class Main {
    public static void main(String[] args) {
        ParrotSpecies european = ParrotFactory.createParrotBehaviour(ParrotType.EUROPEAN, 0, 0.0, false);
        ParrotSpecies african = ParrotFactory.createParrotBehaviour(ParrotType.AFRICAN, 2, 0.0, false);
        ParrotSpecies norwegianBlueFree = ParrotFactory.createParrotBehaviour(ParrotType.NORWEGIAN_BLUE, 0, 2.0, false);
        ParrotSpecies norwegianBlueNailed = ParrotFactory.createParrotBehaviour(ParrotType.NORWEGIAN_BLUE, 0, 2.0, true);

        System.out.println("European speed: " + european.getSpeed());
        System.out.println("African speed: " + african.getSpeed());
        System.out.println("Norwegian Blue (free) speed: " + norwegianBlueFree.getSpeed());
        System.out.println("Norwegian Blue (nailed) speed: " + norwegianBlueNailed.getSpeed());
    }
}
