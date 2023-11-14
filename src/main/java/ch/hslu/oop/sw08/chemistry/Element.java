package ch.hslu.oop.sw08.chemistry;

public enum Element {
    LEAD(1750, -327.43),
    MERCURY(357, -39),
    NITROGEN(-196, -210);

    private static final String AGGREGATIONSTATE_STRING = "%s is %s at %f°C.";
    private final double boilingTemperature;
    private final double fusionTemperature;

    Element(double boilingTemperature, double fusionTemperature) {
        this.boilingTemperature = boilingTemperature;
        this.fusionTemperature = fusionTemperature;
    }

    public final double getBoilingTemperature() {
        return this.boilingTemperature;
    }

    public final double getFusionTemperature() {
        return this.fusionTemperature;
    }

    /**
     * Gets name of element.
     * @return name of element (first letter capitalized).
     */
    public final String getName() {
        return this.name().substring(0, 1).toUpperCase() +
                this.name().substring(1).toLowerCase();
    }

    /**
     * Gets aggregation state depending on given temperature.
     * @param temperature temperature in celsius.
     * @return aggregation state.
     */
    public final AggregationState getAggregationState(double temperature) {
        return temperature < this.fusionTemperature ?
                AggregationState.SOLID : temperature < this.boilingTemperature ?
                AggregationState.LIQUID : AggregationState.GAS;
    }

    /**
     * Gets sentence describing aggregation state depending on given temperature.
     * @param temperature temperature in celsius.
     * @return aggregation state sentence.
     */
    public final String getAggregationStateString(double temperature) {
        AggregationState aggregationState = getAggregationState(temperature);

        return String.format(AGGREGATIONSTATE_STRING, this.getName(), aggregationState.getName(), temperature);
    }

    /**
     * Gets string of object.
     * @return object formatted as string.
     */
    @Override
    public final String toString() {
        return "Element{" +
                "boilingTemperature=" + boilingTemperature +
                ", fusionTemperature=" + fusionTemperature +
                '}';
    }
}
