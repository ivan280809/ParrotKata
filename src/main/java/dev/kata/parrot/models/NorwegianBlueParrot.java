package dev.kata.parrot.models;

public class NorwegianBlueParrot implements ParrotSpecies {

    private static final double BASE_SPEED = 12.0;
    private static final String CRY_SOUND = "Bzzzzzz";
    private static final String DEAD_CRY_SOUND = "...";

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? CRY_SOUND : DEAD_CRY_SOUND;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * BASE_SPEED);
    }
}
