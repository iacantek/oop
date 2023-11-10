package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonNameComparatorTest {
    private static final long id = 1;
    private static final String firstName = "Roland", lastName = "Gisler";
    private static Person person;
    private static PersonNameComparator comparator;

    @BeforeAll
    public static void initPerson() {
        person = new Person(id, firstName, lastName);
        comparator = new PersonNameComparator();
    }

    @Test
    void testCompareEquals() {
        var comparePerson = new Person(id, firstName, lastName);

        assertEquals(0, comparator.compare(person, comparePerson));
    }

    @Test
    void testCompareToEqualsDiffId() {
        var comparePerson = new Person(id + 1, firstName, lastName);

        assertEquals(0, comparator.compare(person, comparePerson));
    }

    @Test
    void testCompareToPositiveByLastName() {
        var comparePerson = new Person(id, firstName, "A" + lastName);

        assertTrue(comparator.compare(person, comparePerson) > 0);
    }

    @Test
    void testCompareToPositiveByLastNameAndFirstName() {
        var comparePerson = new Person(id, "Z" + firstName, "A" + lastName);

        assertTrue(comparator.compare(person, comparePerson) > 0);
    }

    @Test
    void testCompareToPositiveByFirstName() {
        var comparePerson = new Person(id, "A" + firstName, lastName);

        assertTrue(comparator.compare(person, comparePerson) > 0);
    }

    @Test
    void testCompareToNegativeByLastName() {
        var comparePerson = new Person(id, firstName, "Z" + lastName);

        assertTrue(comparator.compare(person, comparePerson) < 0);
    }

    @Test
    void testCompareToNegativeByLastNameAndFirstName() {
        var comparePerson = new Person(id, "A" + firstName, "Z" + lastName);

        assertTrue(comparator.compare(person, comparePerson) < 0);
    }

    @Test
    void testCompareToNegativeByFirstName() {
        var comparePerson = new Person(id, "Z" + firstName, lastName);

        assertTrue(comparator.compare(person, comparePerson) < 0);
    }
}