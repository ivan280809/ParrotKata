package dev.kata.parrot;

import dev.kata.parrot.factory.ParrotFactory;
import dev.kata.parrot.models.ParrotSpecies;
import dev.kata.parrot.models.ParrotType;

public class Main {
    public static void main(String[] args) {

        final long t0 = System.nanoTime();

        ParrotSpecies european = ParrotFactory.createParrotSpecie(ParrotType.EUROPEAN, 0, 0.0, false);
        ParrotSpecies african = ParrotFactory.createParrotSpecie(ParrotType.AFRICAN, 2, 0.0, false);
        ParrotSpecies norwegianBlueFree = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 2.0, false);
        ParrotSpecies norwegianBlueNailed = ParrotFactory.createParrotSpecie(ParrotType.NORWEGIAN_BLUE, 0, 2.0, true);

        System.out.println("European speed: " + european.getSpeed());
        System.out.println("African speed: " + african.getSpeed());
        System.out.println("Norwegian Blue (free) speed: " + norwegianBlueFree.getSpeed());
        System.out.println("Norwegian Blue (nailed) speed: " + norwegianBlueNailed.getSpeed());

        final long t1 = System.nanoTime();
        final double elapsedMs = (t1 - t0) / 1_000_000.0;
        System.out.printf("Elapsed: %.3f ms%n", elapsedMs);
    }
}
