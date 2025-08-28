package dev.kata.parrot;

public abstract class ParrotBehaviour {

    private final ParrotType type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    private ParrotBehaviour(ParrotType type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }
    protected abstract double getSpeed();
    protected abstract String getCry();
}
