package ClosetMen;

public class Main {
    public static void main(String[] args) {
        Men irina = new Men("Ирина", true);
        Men vasya = new Men("Вася", false);
        
        Closet closetFirst = new Closet(StateCloset.full, StateCloset.open);
        Closet closetSecond = new Closet(StateCloset.empty, StateCloset.close);

        new DoSomething().open(closetFirst, irina);
        new DoSomething().open(closetSecond, vasya);
        new DoSomething().open(closetSecond, irina);
        System.out.println("==========================================");
        new DoSomething().close(closetSecond, irina);
        new DoSomething().close(closetFirst, vasya);
        new DoSomething().close(closetSecond, irina);
        System.out.println("==========================================");
        new DoSomething().put(closetFirst, irina);
        new DoSomething().put(closetSecond, vasya);

    }

}