
public class Overriding {
    // Method Overriding= Same name same parameter but can have different signature. Implement Inheritance.
    public static void main(String args[]){
        Animal obj=new Animal();
        obj.eat();
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    int a=5; 
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat only grass");
        System.out.println(a);
    }
}
