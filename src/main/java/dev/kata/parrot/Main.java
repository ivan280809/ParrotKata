package dev.kata.parrot;

public class Main {
    public static void main(String[] args) {
        Parrot european = new Parrot(ParrotType.EUROPEAN, 0, 0.0, false);
        Parrot african = new Parrot(ParrotType.AFRICAN, 2, 0.0, false);
        Parrot norwegianBlueFree = new Parrot(ParrotType.NORWEGIAN_BLUE, 0, 2.0, false);
        Parrot norwegianBlueNailed = new Parrot(ParrotType.NORWEGIAN_BLUE, 0, 2.0, true);

        System.out.println("European speed: " + european.getSpeed());
        System.out.println("African speed: " + african.getSpeed());
        System.out.println("Norwegian Blue (free) speed: " + norwegianBlueFree.getSpeed());
        System.out.println("Norwegian Blue (nailed) speed: " + norwegianBlueNailed.getSpeed());
    }
}
