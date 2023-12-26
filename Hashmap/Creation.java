import java.util.*;
public class Creation {
    public static void main(String args[]){

    //Create
    HashMap<String, Integer> hm=new HashMap<>();

    //Insert
    hm.put("India",100);
    hm.put("China",101);
    hm.put("America",102);
    hm.put("Pak",103);
    System.out.println(hm);

    //Get
    int population=hm.get("India");
    System.out.println("population of Ind= "+population );
    //Remove
    hm.remove("Pak");
    System.out.println(hm);

    //Size
    System.out.println("size= "+hm.size());

    //isEmpty
    System.out.println(hm.isEmpty());

    //Clear
    hm.clear();
     System.out.println(hm.isEmpty());   
}
}
