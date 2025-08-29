package dev.kata.parrot.models;

public class EuropeanParrot implements ParrotBehaviour {

    private static final double BASE_SPEED = 12.0;
    private static final String CRY_SOUND = "Sqoork!";


    public EuropeanParrot() {
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return CRY_SOUND;
    }
}
