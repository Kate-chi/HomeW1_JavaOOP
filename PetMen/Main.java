package PetMen;

public class Main {
    public static void main(String[] args) {
        Men irina = new Men("Ирина");
        Cat moon = new Cat("Луна");
        
        irina.callCats(moon);
        irina.caress(moon);
        irina.feeds(moon);
    }
}
