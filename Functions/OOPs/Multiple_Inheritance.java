public class Multiple_Inheritance {
    public static void main(String args[]){
        Beer obj=new Beer();
        obj.eat();
    }
}
interface carnivore{
    void eat();
}
interface herbivore {
    void eat();
}
class Beer implements carnivore,herbivore{
    public void eat(){
        System.out.println("Eat Both");
    }
}
