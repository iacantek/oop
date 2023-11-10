package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    private static Lead lead;
    private static Mercury mercury;
    private static Nitrogen nitrogen;

    @BeforeAll
    static void initElements() {
        lead = new Lead();
        mercury = new Mercury();
        nitrogen = new Nitrogen();
    }

    @Test
    void getBoilingTemperature() {
    }

    @Test
    void getFusionTemperature() {
    }

    @Test
    void testLeadInstanceOfElement() {
        assertInstanceOf(Element.class, lead);
    }

    @Test
    void testMercuryInstanceOfElement() {
        assertInstanceOf(Element.class, mercury);
    }

    @Test
    void testNitrogenInstanceOfElement() {
        assertInstanceOf(Element.class, nitrogen);
    }

    @Test
    void testNotEqualsLeadMercury() {
        assertFalse(lead.equals(mercury));
        assertFalse(mercury.equals(lead));
    }

    @Test
    void testNotEqualsMercuryNitrogen() {
        assertFalse(mercury.equals(lead));
        assertFalse(nitrogen.equals(mercury));
    }

    @Test
    void testNotEqualsLeadNitrogen() {
        assertFalse(lead.equals(nitrogen));
        assertFalse(nitrogen.equals(lead));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}