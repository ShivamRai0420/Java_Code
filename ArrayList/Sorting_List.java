import java.util.*;
public class Sorting_List {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(3);

    //Ascending sort list    
        Collections.sort(list);
        System.out.println(list);

    //Descending sort list
    Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
