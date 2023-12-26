public class Shift {
   public static void main(String args[]){
    //Right shift
    int a=5>>2;             //trick a>>b=a/(2^b) i.e 5/(2^2)=1
    //Left shift
    int b=5<<2;             //trick a<<b=a*(2^b) i.e 5*(2^2)=20
    System.out.println("Right shift= "+a);;
    System.out.println("Left shift= "+b);;
   } 
}
