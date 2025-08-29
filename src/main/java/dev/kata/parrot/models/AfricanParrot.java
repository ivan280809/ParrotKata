package dev.kata.parrot.models;

public class AfricanParrot implements ParrotBehaviour {

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;
    private static final String CRY_SOUND = "Sqaark!";

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return CRY_SOUND;
    }

    private double getBaseSpeed() {
        return BASE_SPEED;
    }

    private double getLoadFactor() {
        return LOAD_FACTOR;
    }
}
