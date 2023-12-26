public class VowelsInString {
    public static void printVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                System.out.print(" "+str.charAt(i));
                count++;
            }
        }
        System.out.println(" Total Vowel= "+count);
    }
    public static void main(String args[]){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        printVowels(str);
    }
}
