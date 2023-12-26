import java.util.*;
public class Declaration {
    public static void main(String args[]){
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.remove(3);       //removed 3
        hs.contains(1);     //true
        System.out.println(hs);
        System.out.println("size= "+hs.size());

        for(int i:hs){
            System.out.println(hs);
        }
    }
}
