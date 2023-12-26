public class Sum {
    public static int getsum(int a,int b){
        // int sum=a+b;
        return a+b; 
    }
    public static float getsum(float a,float b,int c){
        // int sum=a+b+c;
        return a+b+c; 
    }

    public static void main(String args[]){
     System.out.println(getsum(5,5));
     System.out.println(getsum(5.4f,5.2f,4));
    }
}
