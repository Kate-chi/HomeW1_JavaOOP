package ClosetMen;

public class Men {
    public String fullName;
    public Boolean key;

    public Men(String fullName, Boolean key) {
        this.fullName = fullName;
        this.key = key;
    }

    @Override
    public String toString() {
        return String.format("%s, %b",fullName, key);
    }
}
