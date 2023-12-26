public class Overloading {
    public static void main(String args[]){
        Calculator obj=new Calculator();
        int a=5;
        int b=5;
        obj.sum(a,b);
        obj.sum((float)5.5,(float)5.5);

    }
}

class Calculators{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
}
