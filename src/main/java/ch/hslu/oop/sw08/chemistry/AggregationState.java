package ch.hslu.oop.sw08.chemistry;

public enum AggregationState {
    SOLID,
    LIQUID,
    GAS;

    public String getName() {
        return this.name().toLowerCase();
    }
}
