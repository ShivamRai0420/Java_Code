import java.util.Scanner;
                                                //STRING -- ARRAY

public class StringArray {
    public static void main(String args[]){
        
        // For take char i/p from user;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter size of String arr");
        // int n=sc.nextInt();

        // input String arr
        // System.out.println("Enter char arr element");
        // String str[]=new String[n];
        // for(int i=0;i<n;i++){
        //     str[i]=sc.nextLine();
        // }
        // Print String arr
        // System.out.println("Entered String arr element");
        // for(int i=0;i<n;i++){
        //     System.out.print(str[i]+" ");
        // }


                                // IMPORTANT METHOD
        String st="Shivam";                        
        String st1="Rai";
        String st2="   Shivam Rai";


        System.out.println(st.toUpperCase());
        System.out.println(st.concat(st1));
        System.out.println(st.equals(st1));
        System.out.println(st2.trim());
        System.out.println(st.substring(2));
        System.out.println(st.substring(2,6));
        System.out.println(st.substring(2,5));

    }
}
