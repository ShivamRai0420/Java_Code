
public class Multi_Level{
    public static void main(String args[]){
        GrandSon obj=new GrandSon();
        obj.car();
        obj.home();
        obj.money();
        obj.bike="Hayabusa";
        System.out.println("Grandson's Bike = "+obj.bike);
        System.out.println("Total money= "+obj.money1);
    }
}

//Base class
class Father{
    int money=100000;
    String home="1Villa";
    void home(){
        System.out.println("Fathe's home= "+home);
    }
}
//Derived class
class Son extends Father{
    String car="1-BMW";
    int money1=10000;
    void money(){
        System.out.println("Son's money= "+money);
    }
}
//Sub class
class GrandSon extends Son{
    String bike;
    void car(){
        System.out.println("GrandSon's also have car= "+car);
    }
}