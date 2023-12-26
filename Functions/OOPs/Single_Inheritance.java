public class Single_Inheritance {
    public static void main(String args[]){
        Son obj=new Son();
        obj.totalpaisa();
        obj.ghar();
    }
}

//Base class
class Father{
    int money=100000;
    String home="1Villa";
    void paisa(){
        System.out.println("Father's paisa= "+money);
    }
    void ghar(){
        System.out.println("Father's home= "+home);
    }
}

//Derived class
class Son extends Father{
    int money1=100000;
    void totalpaisa(){
        System.out.println("Total Son+ Father money= "+(money+money1));

    }
}
