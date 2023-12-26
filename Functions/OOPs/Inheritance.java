
public class Inheritance {
    public static void main(String args[]){
        Fish obj=new Fish();
        obj.swim();
        obj.eat();
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void brath(){
        System.out.println("brathes");
    }
}
//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
   
}
