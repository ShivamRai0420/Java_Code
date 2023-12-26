import java.util.ArrayList ;
import java.util.Scanner ;

public class ArrList_Creation {
    public static void main(String args[]){
        //Creation

      // ClassName Object name= new ClassName();  IN OOPS. 
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();
      
      //Initialise value to list by "add" fun.  
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Before"+list);

      //Retrieve  value to list by "get" fun.
        int elm=list.get(3);  
        System.out.println(elm);

      //Remove  value to list by "remove" fun.
      int htao=list.remove(2); 

      //Set  value to list by "set" fun.
      int setkro=list.set(1,10); 
      System.out.println("After operation "+list); 

      //contains : it check no. exist or not give True & False.
      
      System.out.println(list.contains(1));
      System.out.println(list.contains(100));

     //list.size():= get size of list 
      System.out.println(list.size());
      

    }
}
