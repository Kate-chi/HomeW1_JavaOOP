package ClosetMen;

public class DoSomething {

    public void open(Closet closet, Men men){
        if (closet.stateOpenClose == StateCloset.close && men.key == true)
        {
            System.out.println(men.fullName + ", Вы открыли шкаф!");
            closet.stateOpenClose = StateCloset.open;
        } 
        else if (closet.stateOpenClose == StateCloset.close && men.key == false) 
            System.out.println(men.fullName + ", Вы потеряли ключ?"); 
        else 
            System.out.println(men.fullName + ", шкаф уже открыт");  
    }


    public void close(Closet closet, Men men){
        if (closet.stateOpenClose == StateCloset.open && men.key == true)
        {
            System.out.println(men.fullName + ", шкаф надежно закрыт!");
            closet.stateOpenClose = StateCloset.close;
        } 
        else if (closet.stateOpenClose == StateCloset.open && men.key == false) 
            System.out.println(men.fullName + ", без ключа любой жулик залезет в ваш шкаф"); 
        else 
            System.out.println(men.fullName + ", закрыть его сильнее не выйдет");
    }

    public void put(Closet closet, Men men){
        if (closet.stateFullEmpty == StateCloset.full)
            System.out.println(men.fullName + ", пора разобраться в шкафу, он заполнен");
        else 
            System.out.println(men.fullName + ", вы положили вещи в шкаф");
        
    }
}
