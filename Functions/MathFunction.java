import java.util.*;
public class MathFunction {
    public static void main(String args[]){
        int a=5;
        int b=2;
        float c=84.9f;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(b));
        System.out.println( "Ceil value"+ Math.ceil(c));
        System.out.println(Math.abs(c));    //Always return +ve
        System.out.println(Math.round(c));
    }
}
