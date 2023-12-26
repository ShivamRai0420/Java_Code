import java.util.*;
public class CharArray {
                                            //CHARACTER -- ARRAY

    public static void main(String args[]){

        // For take char i/p from user;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter size of char arr");
        // int n=sc.nextInt();

        //input char arr
        // System.out.println("Enter char arr element");
        // char arr[]=new char[n];                 //Declaration
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.next().charAt(0);
        // }

        //Printing char array
        // System.out.println("Entered char arr elm are");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

        //                                 // IMPORTANT METHOD
        // char ch='S';
        // char ch1[]={'S','K','R'};
        // System.out.println("Char="+ch);
        // for(int i=0;i<ch1.length;i++){

        //     System.out.println("CarArr="+ch1[i]);
        // }  
        
        // System.out.println("Enter char arr elm ");
        // char chr=sc.next().charAt(0);
        // System.out.println("Entered char arr elm are= "+chr);
        // System.out.println("Entered char arr elm are= "+Character.isLetter(ch));
        // System.out.println("Entered char arr elm are= "+Character.isWhitespace(ch));
        // System.out.println("Entered char arr elm are= "+Character.isDigit(ch));
        // System.out.println("Entered char arr elm are= "+Character.toUpperCase(ch));
        // System.out.println("Entered char arr elm are= "+Character.toString(ch));


        char chr1=sc.next().charAt(0);
        System.out.println(chr1);
        System.out.println(Character.isUpperCase(chr1));
        System.out.println(Character.isLowerCase(chr1));
        System.out.println(Character.isDigit(chr1));
        System.out.println(Character.isWhitespace(chr1));
        System.out.println(Character.toUpperCase(chr1));

    }
}
