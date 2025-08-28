package dev.kata.parrot;

public class EuropeanParrot extends ParrotBehaviour  {

    public EuropeanParrot() {
        super(ParrotType.EUROPEAN, 0, 0, false);
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
