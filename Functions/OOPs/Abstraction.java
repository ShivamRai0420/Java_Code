public class Abstraction {
    public static void main(String args[]){
    Sons obj =new Sons(); 
    obj.car();
    Dughter obj1 =new Dughter(); 
    obj1.car();
    obj1.paisa();
    }
}
abstract class Fathers{                      //Super Class
    abstract void car();                    //Abstract Method
     void paisa(){
        System.out.println("one lakh");
    }
}
class Sons extends Fathers{                   //Sub class
    void car(){
        System.out.println(" Abstract method defined:- one car");
    }
} 
class Dughter extends Fathers{                   //Sub class
    void car(){
        System.out.println(" Abstract method defined in Dughter:-");
    }
} 
