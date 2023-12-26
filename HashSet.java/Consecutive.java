import java.util.*;
public class Consecutive {
    public static void main(String args[]){
        int arr[]={5,2,6,2,4,2,1,3};
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
            // System.out.println(i); 
        }
        int maxStreak=0;
        for(int i:hs){
            //is starting point of sequence
            if(!hs.contains(i-1)){
                int currNum=i;
                int currStreak=1;
                while(hs.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        System.out.println( maxStreak);
    }
}
