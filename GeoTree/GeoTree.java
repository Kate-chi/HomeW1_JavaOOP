import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return this.tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, children, Relationship.parent));
        tree.add(new Node(children, parent, Relationship.children));
    }

    @Override
    public String toString() {
        return String.format("все древо: " + tree);
    }

}