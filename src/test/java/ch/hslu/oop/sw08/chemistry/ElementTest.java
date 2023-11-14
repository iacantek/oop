package ch.hslu.oop.sw08.chemistry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    private static final String AGGREGATIONSTATE_STRING = "%s is %s at %f°C.";

    @Test
    void testConstructorLead() {
        Element lead = Element.LEAD;

        assertEquals(1750, lead.getBoilingTemperature(), 1f);
        assertEquals(-327.43, lead.getFusionTemperature(), 0.01f);
    }

    @Test
    void testConstructorMercury() {
        Element mercury = Element.MERCURY;

        assertEquals(357, mercury.getBoilingTemperature(), 1f);
        assertEquals(-39, mercury.getFusionTemperature(), 1f);
    }

    @Test
    void testConstructorNitrogen() {
        Element nitrogen = Element.NITROGEN;

        assertEquals(-196, nitrogen.getBoilingTemperature(), 1f);
        assertEquals(-210, nitrogen.getFusionTemperature(), 1f);
    }

    @Test
    void testGetAggregationStateLeadGas() {
        assertEquals(AggregationState.GAS, Element.LEAD.getAggregationState(1800));
    }

    @Test
    void testGetAggregationStateLeadLiquid() {
        assertEquals(AggregationState.LIQUID, Element.LEAD.getAggregationState(-327.43));
    }

    @Test
    void testGetAggregationStateLeadSolid() {
        assertEquals(AggregationState.SOLID, Element.LEAD.getAggregationState(-327.44));
    }

    @Test
    void testGetAggregationStateStringLeadGas() {
        double temperature = 1800;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.LEAD.getName(), AggregationState.GAS.getName(), temperature), Element.LEAD.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringLeadLiquid() {
        double temperature = -327.43;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.LEAD.getName(), AggregationState.LIQUID.getName(), temperature), Element.LEAD.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringLeadSolid() {
        double temperature = -327.44;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.LEAD.getName(), AggregationState.SOLID.getName(), temperature), Element.LEAD.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateMercuryGas() {
        assertEquals(AggregationState.GAS, Element.MERCURY.getAggregationState(357));
    }

    @Test
    void testGetAggregationStateMercuryLiquid() {
        assertEquals(AggregationState.LIQUID, Element.MERCURY.getAggregationState(-38.9));
    }

    @Test
    void testGetAggregationStateMercurySolid() {
        assertEquals(AggregationState.SOLID, Element.MERCURY.getAggregationState(-100.7));
    }

    @Test
    void testGetAggregationStateStringMercuryGas() {
        double temperature = 357;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.MERCURY.getName(), AggregationState.GAS.getName(), temperature), Element.MERCURY.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringMercuryLiquid() {
        double temperature = -38.9;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.MERCURY.getName(), AggregationState.LIQUID.getName(), temperature), Element.MERCURY.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringMercurySolid() {
        double temperature = -100.7;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.MERCURY.getName(), AggregationState.SOLID.getName(), temperature), Element.MERCURY.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateNitrogenGas() {
        assertEquals(AggregationState.GAS, Element.NITROGEN.getAggregationState(-196.0));
    }

    @Test
    void testGetAggregationStateNitrogenGasInaccuracy() {
        assertEquals(AggregationState.GAS, Element.NITROGEN.getAggregationState(-196.00000000000001));
    }

    @Test
    void testGetAggregationStateNitrogenLiquid() {
        assertEquals(AggregationState.LIQUID, Element.NITROGEN.getAggregationState(-196.0000000000001));
    }

    @Test
    void testGetAggregationStateNitrogenSolid() {
        assertEquals(AggregationState.SOLID, Element.NITROGEN.getAggregationState(-210.1));
    }

    @Test
    void testGetAggregationStateStringNitrogenGas() {
        double temperature = -196.0;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.NITROGEN.getName(), AggregationState.GAS.getName(), temperature), Element.NITROGEN.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringNitrogenGasInaccuracy() {
        double temperature = -196.00000000000001;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.NITROGEN.getName(), AggregationState.GAS.getName(), temperature), Element.NITROGEN.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringNitrogenLiquid() {
        double temperature = -196.0000000000001;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.NITROGEN.getName(), AggregationState.LIQUID.getName(), temperature), Element.NITROGEN.getAggregationStateString(temperature));
    }

    @Test
    void testGetAggregationStateStringNitrogenSolid() {
        double temperature = -210.1;

        assertEquals(String.format(AGGREGATIONSTATE_STRING, Element.NITROGEN.getName(), AggregationState.SOLID.getName(), temperature), Element.NITROGEN.getAggregationStateString(temperature));
    }

    @Test
    void testToStringLead() {
        Element element = Element.LEAD;

        assertEquals("Element{" +
                "boilingTemperature=" + element.getBoilingTemperature() +
                ", fusionTemperature=" + element.getFusionTemperature() +
                '}', element.toString());
    }

    @Test
    void testToStringMercury() {
        Element element = Element.MERCURY;

        assertEquals("Element{" +
                "boilingTemperature=" + element.getBoilingTemperature() +
                ", fusionTemperature=" + element.getFusionTemperature() +
                '}', element.toString());
    }

    @Test
    void testToStringNitrogen() {
        Element element = Element.NITROGEN;

        assertEquals("Element{" +
                "boilingTemperature=" + element.getBoilingTemperature() +
                ", fusionTemperature=" + element.getFusionTemperature() +
                '}', element.toString());
    }
}