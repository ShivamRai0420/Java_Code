// package Recursion;
public class RemoveStrDup {
        public static void RemoveDup(String str,int idx, StringBuilder newstr,boolean map[]){
            //Base case
            if(idx==str.length()){
                System.out.println(newstr);
                return;
            }
            //kaam
            char currchar=str.charAt(idx);
            if(map[currchar -'a']==true){
                //duplicate
                RemoveDup(str,idx+1,newstr, map);
            }
            else{
                map[currchar -'a']=true;
                RemoveDup(str,idx+1,newstr.append(currchar), map);
            }
        }

    public static void main(String args[]){
        String str="apnacollege";
        RemoveDup(str,0,new StringBuilder(""),new boolean[26]);
    }
}
