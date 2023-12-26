public class Super_Keyword {
    public static void main(String args[]){
        Horse obj =new Horse();
        System.out.println(obj.color);
    }
}
class Animals{
    String color;
    Animals(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animals{
    Horse(){
        super();        //call imediste parent class
        super.color="brown";
        System.out.println("Horse constructor is called");
    }
}
