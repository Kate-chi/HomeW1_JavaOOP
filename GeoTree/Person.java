public class Person {
    public String fullName;
    public String yearOfBirth;
    public String yearOfDeath;

    public Person(String fullName, String yearOfBirth, String yearOfDeath) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
    }

    // public String getFullName() {
    //     return this.fullName;
    // }

    @Override
    public String toString() {
        return String.format(fullName);
    }
}
