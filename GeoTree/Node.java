public class Node {
    Person firstPerson;
    Person secondPerson;
    Relationship relationship;

    public Node(Person p1, Person p2, Relationship re) {
        this.firstPerson = p1;
        this.secondPerson = p2;
        this.relationship = re;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", firstPerson, secondPerson, relationship);
    }
}
