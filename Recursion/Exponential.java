public class Exponential {
    public static int power(int x,int n){
        //Base case
        if(n==0){
            return 1;
        }
        int smallerProblem=power(x,n-1);
        int biggerProblem=x*smallerProblem;
        return biggerProblem;

        //return x*power(x,n-1);
       
    }   
    public static void main(String args[]){
        
        System.out.println(power(2,10));
    }
}
