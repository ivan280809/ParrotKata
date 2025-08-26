package dev.kata.parrot;

public class Parrot {

    private final ParrotType type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean nailed;

    public Parrot(ParrotType type, int numberOfCoconuts, double voltage, boolean nailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.nailed = nailed;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return 12.0;
            case AFRICAN:
                return Math.max(0.0, 12.0 - 9.0 * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return nailed ? 0.0 : Math.min(24.0, voltage * 12.0);
            default:
                throw new IllegalStateException("Tipo de loro no soportado: " + type);
        }
    }

    public ParrotType getType() { return type; }
    public int getNumberOfCoconuts() { return numberOfCoconuts; }
    public double getVoltage() { return voltage; }
    public boolean isNailed() { return nailed; }
}
