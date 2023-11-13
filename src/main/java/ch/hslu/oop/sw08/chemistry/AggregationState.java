package ch.hslu.oop.sw08.chemistry;

public enum AggregationState {
    SOLID,
    LIQUID,
    GAS;

    /**
     * Gets name of aggregation state.
     * @return aggregation state in lowercase.
     */
    public String getName() {
        return this.name().toLowerCase();
    }
}
