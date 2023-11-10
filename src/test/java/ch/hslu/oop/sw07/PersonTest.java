package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private static final long id = 1;
    private static final String firstName = "Roland", lastName = "Gisler";
    private static Person person;

    @BeforeAll
    public static void initPerson() {
        person = new Person(id, firstName, lastName);
    }

    @Test
    public void testConstructor() {
        assertEquals(id, person.getId());
        assertEquals(firstName, person.getFirstName());
        assertEquals(lastName, person.getLastName());
    }

    @Test
    public void testEquals() {
        var comparePerson = new Person(id, firstName, lastName);

        assertTrue(person.equals(comparePerson));
    }

    @Test
    public void testNotEqualsId() {
        var comparePerson = new Person(id + 1, firstName, lastName);

        assertFalse(person.equals(comparePerson));
    }

    @Test
    public void testNotEqualsFirstName() {
        var comparePerson = new Person(id, firstName + "s", lastName);

        assertFalse(person.equals(comparePerson));
    }

    @Test
    public void testNotEqualsLastName() {
        var comparePerson = new Person(id, firstName, lastName + "s");

        assertFalse(person.equals(comparePerson));
    }

    @Test
    public void testEqualHashCode() {
        var comparePerson = new Person(id, firstName, lastName);

        assertEquals(person.hashCode(), comparePerson.hashCode());
    }

    @Test
    public void testNotEqualHashCodeId() {
        var comparePerson = new Person(id + 1, firstName, lastName);

        assertNotEquals(person.hashCode(), comparePerson.hashCode());
    }

    @Test
    public void testNotEqualHashCodeFirstName() {
        var comparePerson = new Person(id, firstName + "s", lastName);

        assertNotEquals(person.hashCode(), comparePerson.hashCode());
    }

    @Test
    public void testNotEqualHashCodeLastName() {
        var comparePerson = new Person(id, firstName, lastName + "s");

        assertNotEquals(person.hashCode(), comparePerson.hashCode());
    }

    @Test
    void testCompareToEquals() {
        var comparePerson = new Person(id, firstName, lastName);

        assertEquals(0, person.compareTo(comparePerson));
    }

    @Test
    void testCompareToEqualsDiffId() {
        var comparePerson = new Person(id + 1, firstName, lastName);

        assertEquals(0, person.compareTo(comparePerson));
    }

    @Test
    void testCompareToPositiveByLastName() {
        var comparePerson = new Person(id, firstName, "A" + lastName);

        assertTrue(person.compareTo(comparePerson) > 0);
    }

    @Test
    void testCompareToPositiveByLastNameAndFirstName() {
        var comparePerson = new Person(id, "Z" + firstName, "A" + lastName);

        assertTrue(person.compareTo(comparePerson) > 0);
    }

    @Test
    void testCompareToPositiveByFirstName() {
        var comparePerson = new Person(id, "A" + firstName, lastName);

        assertTrue(person.compareTo(comparePerson) > 0);
    }

    @Test
    void testCompareToNegativeByLastName() {
        var comparePerson = new Person(id, firstName, "Z" + lastName);

        assertTrue(person.compareTo(comparePerson) < 0);
    }

    @Test
    void testCompareToNegativeByLastNameAndFirstName() {
        var comparePerson = new Person(id, "A" + firstName, "Z" + lastName);

        assertTrue(person.compareTo(comparePerson) < 0);
    }

    @Test
    void testCompareToNegativeByFirstName() {
        var comparePerson = new Person(id, "Z" + firstName, lastName);

        assertTrue(person.compareTo(comparePerson) < 0);
    }

    @Test
    public void testToString() {
        assertEquals("Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}',
                person.toString());
    }
}