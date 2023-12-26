import java.util.*;
public class Anagram {
    public static void main(String args[]){
    String s="keen";
    String t="knee";

    HashMap<Character,Integer>hm1=new HashMap<>();
    for(int i=0;i<s.length();i++){
        Character ch=s.charAt(i);
        if(!hm1.containsKey(ch)){
            hm1.put(ch,1);
        }
        else{
            hm1.put(ch,hm1.get(ch)+1);
        }
    }
    System.out.println(hm1);
    // HashMap<Character,Integer>hm2=new HashMap<>();
    if(s.equals(t)){
        System.out.println("Anagram");
    }
    }
}
