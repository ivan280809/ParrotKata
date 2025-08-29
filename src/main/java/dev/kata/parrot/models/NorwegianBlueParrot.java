package dev.kata.parrot.models;

public class NorwegianBlueParrot implements ParrotSpecies {

    private static final double BASE_SPEED = 12.0;
    private static final double MIN_SPEED = 24.0;
    private static final String CRY_SOUND = "Bzzzzzz";
    private static final String DEAD_CRY_SOUND = "...";
    private static final double NO_SPEED = 0;

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        if (voltage < 0.0) {
            throw new IllegalArgumentException("voltage must be >= 0");
        }
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? NO_SPEED : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > NO_SPEED ? CRY_SOUND : DEAD_CRY_SOUND;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MIN_SPEED, voltage * BASE_SPEED);
    }
}
