import java.util.ArrayList;

public class PersonsLive {

    private ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public void append(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        return String.format("все люди: " + persons);
    }
}
