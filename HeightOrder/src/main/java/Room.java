import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person el : persons) {
            if (el.getHeight() < shortest.getHeight()) {
                shortest = el;
            }
        }
        return shortest;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = shortest();

        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
