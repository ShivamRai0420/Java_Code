public class whileLoop {
    public static void main(String args[]){
        int n=0;
        while(n<3){
            System.out.println("hello");
            n++;
        }

        //1 to 10
        int i=1;
        int sum=0;
        while(i<=10){
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println("total= " +sum);
    }
}
