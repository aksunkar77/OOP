package people;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<Person>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public void printPeopleWithPets() {
        for (Person p : people) {
            if (p.hasPet()) {
                System.out.println(p);
            }
        }
    }

    public void printPeopleWithoutPets() {
        for (Person p : people) {
            if (!p.hasPet()) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Person p : people) {
            result += p.toString() + "\n";
        }
        return result;
    }
}