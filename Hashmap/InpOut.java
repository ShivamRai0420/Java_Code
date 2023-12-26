import java.util.*;
public class InpOut {
    public static void main(String args[]){
    HashMap<Integer,String>hm=new HashMap<>();

    //Adding elm in hm.
    hm.put(1, "Skr");
    hm.put(2, "Rcb");
    hm.put(3, "Csk");
    hm.put(4, "Kkr");
    
    //Getting value of a key from hm
    // System.out.println(hm.get(3));    //-->"ekr"
    // System.out.println(hm.get("skr"));  //-->if nt then print Null
    
    //Changing value of a key from hm
    // System.out.println(hm.put(4,"skr"));
    // System.out.println(hm);

    //Remove pair from hm
    // System.out.println(hm.remove(4));
    // System.out.println(hm);

    //Checking if a key is in  hm
    // System.out.println(hm.containsKey(2));      //true
    // System.out.println(hm);

    //Adding new entry only if new key doesnt exist if a key is in the hm
    // hm.putIfAbsent(7,"sdfg");           //will enter
    // hm.putIfAbsent(1,"sffffff");        //will not enter
    // System.out.println(hm);

    //Get all key in hm
    // System.out.println(hm.keySet());

    //Get all value in hm
    // System.out.println(hm.values());

    //Get all entries in hm
    System.out.println(hm.entrySet());

    //Traversing
    // for(int key:hm.keySet()){
        // System.out.println("Team is "+hm.get(key)+ " Always number "+key);
    // System.out.printf("Team is %d and no. is %s\n",key,hm.get(key));
    // }
}
}