// package Recursion;

public class Fctorial {
    public static int printFact(int n){
        //Base case
        if(n==0){
            n=1;
            return 1;
        }
        int smallerProblem=printFact(n-1);
        int biggerProblem=n*smallerProblem;
        return biggerProblem;
    }
    public static void main(String args[]){
        int n=5;
        printFact(n);
        System.out.println(printFact(n));
    }
}
