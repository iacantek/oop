package ch.hslu.oop.sw12;

import java.util.ArrayList;
import java.util.Collection;

public class PersonCollection {
    private final Collection<Person> people;

    public PersonCollection() {
        this.people = new ArrayList();
    }

    public final Collection<Person> getPeople() {
        return people;
    }

    public final void add(final Person person) {
        this.people.add(person);
    }
}
