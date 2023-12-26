import java.util.*;
public class RemoveDup {
    public static void main(String args[]){
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.print(hs+" ");

    }
}
