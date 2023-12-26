import java.util.*;
public class MultiD_Arraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList= new ArrayList<>();
        ArrayList<Integer>List= new ArrayList<>();
        List.add(1);
        List.add(2);
        mainList.add(List);
        
        //2nd Arralist
        ArrayList<Integer>List1= new ArrayList<>();
        List1.add(3);
        List1.add(4);
        mainList.add(List1);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>CurrList=mainList.get(i);
            for(int j=0;j<CurrList.size();j++){
                System.out.print(CurrList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList+" ");
    }
}
