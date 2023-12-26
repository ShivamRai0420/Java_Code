import java.util.*;
public class StringP {
    public static void main(String args[]){
        // System.out.println("Enter size of str")
        String str="asd";
        String str2[]={"asd","gdh"};
        char ch='s';
        char ch1[]={'j','a','s'};
        System.out.println(str.toUpperCase());
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isWhitespace(ch));
        System.out.println(str2[1]);
        System.out.println("char a="+ ch);

        //for print char array
        for(int i=0;i<ch1.length;i++){
            System.out.print("char Array="+ch1[i] +" ");
        }
        System.out.println();
        //for print String array
        for(int i=0;i<str2.length;i++){
            System.out.print("String Array="+str2[i] +" ");
        }
    }
}
