
import java.util.ArrayList;

public class Reverse_ArrList {
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(3);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
