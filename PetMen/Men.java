package PetMen;

public class Men {
    public String fullName;
    public String callCats = "Кис - Кис";

    public Men(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }

    public void callCats(Cat cat) {
        System.out.println(this.fullName + " зовет котика <" + callCats + "> и слышит в ответ <" + cat.catVoice + ">");
    }

    public void caress(Cat cat){
        int num = (int) ( Math.random() * 2 );
        if(num == 1)
            System.out.println(this.fullName + " вы все делаете правильно " + cat.catName + " довольна происходящим");
        else
            System.out.println(this.fullName + " бегите. " + cat.catName + " сейчас укусит");
    }

    public void feeds(Cat cat){
        int num = (int) ( Math.random() * 2 );
        if(num == 1)
            System.out.println(this.fullName + " самое время " + cat.catName + " очень голодна");
        else
            System.out.println(this.fullName + " хватит " + cat.catName + " уже сыта");
    }


}
