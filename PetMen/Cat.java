package PetMen;


public class Cat {
    public String catName;
    public String catVoice = "Мяу";

    public Cat(String catName) {
        this.catName = catName;
    }

    public String getName() {
        return catName;
    }

    public void setName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return String.format("%s",catName);
    }

    
}
