package ch.hslu.oop.sw08.chemistry;

public enum Element {
    LEAD(1750, -327.43),
    MERCURY(357, -39),
    NITROGEN(-196, -210);

    private static final String AGGREGATIONSTATE_STRING = "%s is %s at %f°C.";
    private final double boilingTemperature;
    private final double fusionTemperature;

    private Element(double boilingTemperature, double fusionTemperature) {
        this.boilingTemperature = boilingTemperature;
        this.fusionTemperature = fusionTemperature;
    }

    public final double getBoilingTemperature() {
        return this.boilingTemperature;
    }

    public final double getFusionTemperature() {
        return this.fusionTemperature;
    }

    public final String getName() {
        return this.name().substring(0, 1).toUpperCase() +
                this.name().substring(1).toLowerCase();
    }

    public final AggregationState getAggregationState(double temperature) {
        return temperature < this.fusionTemperature ?
                AggregationState.SOLID : temperature < this.boilingTemperature ?
                AggregationState.LIQUID : AggregationState.GAS;
    }

    public final String getAggregationStateString(double temperature) {
        AggregationState aggregationState = getAggregationState(temperature);

        return String.format(AGGREGATIONSTATE_STRING, this.getName(), aggregationState.getName(), temperature);
    }

    @Override
    public final String toString() {
        return "Element{" +
                "boilingTemperature=" + boilingTemperature +
                ", fusionTemperature=" + fusionTemperature +
                '}';
    }
}
