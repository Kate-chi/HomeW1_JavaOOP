public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "1000", "1500");
        Person vasya = new Person("Вася", "1300", "1900");
        Person masha = new Person("Маша", "1400", "2000");
        Person jane = new Person("Женя", "1600", "still alive");
        Person ivan = new Person("Ваня", "1700", "still alive");

        GeoTree geoTree = new GeoTree();

        geoTree.append(irina, vasya);
        geoTree.append(irina, masha);
        geoTree.append(vasya, jane);
        geoTree.append(vasya, ivan);

        PersonsLive person = new PersonsLive();

        person.append(irina);
        person.append(vasya);
        person.append(masha);
        person.append(jane);
        person.append(ivan);

        new Reserch(geoTree).findFamilyTies(irina, Relationship.parent);
        new Reserch(geoTree).findFamilyTies(masha, Relationship.children);

        System.out.println("===============================");

        System.out.println(geoTree);
        System.out.println(person);

        System.out.println("===============================");

        new Reserch(geoTree).surviveOrNot(irina);
        new Reserch(geoTree).surviveOrNot(jane);

        System.out.println("===============================");

        new Reserch(person).findStillAlive();


    }
}
