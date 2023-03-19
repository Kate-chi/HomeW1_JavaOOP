import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<Person> people;

    public Reserch(GeoTree geoTree) {
        this.tree = geoTree.getTree();
    }

    public Reserch(PersonsLive persons) {
        this.people = persons.getPersons();
    }

    public void findFamilyTies(Person person, Relationship relationship) {
        for (Node t : tree) {
            if (t.firstPerson.fullName == person.fullName && t.relationship == relationship) {
                result.add(t.secondPerson.fullName);
            }
        }
        if(relationship == Relationship.parent)
            System.out.println(person + " родитель: " + result);
        else
            System.out.println(person + " ребенок: " + result);
    }

    public void surviveOrNot(Person person){
        if (person.yearOfDeath == "still alive")
            System.out.println(person + " still alive ^-^");
        else
            System.out.println("Sorry, " + person + " did not survived ._.");
    }

    public void findStillAlive(){
        for (Person t : people){
            if(t.yearOfDeath == "still alive"){
                result.add(t.fullName);
            }
        }
        if (result.size() > 0)
            System.out.println("Still Alive: " + result);
        else
            System.out.println("Sorry, no one survived ._.");
    }



}
