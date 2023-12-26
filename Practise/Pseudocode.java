public class Pseudocode {
    public static void main(String args[]){
        //Q1.
        int i;
        for( i=1;i<6;i++){
            if(i>3){
                continue;
            }
        }
        System.out.println("Answer 1"+i);

        //Q2
        // int count=1;
        // while(count<=15){
        //     System.out.println(count%2==1 ? "***": "+++++");
        //     ++count;
        // }
        //Q3
        int x=3,y=5,z=10;
        System.out.println("Ans 3="+ (++z+y-y+z+x++));
        
        //Q4
        int a=10;
        System.out.println("Ans 4="+a--*a--);
        //Q5
        int meal=5;
        int tip=2;
        System.out.println("Ans 5="+(meal>6? ++tip: --tip));

        //Q6
        int n=5;
        for(int j=1;j<=5;j++){
            for(int k=j;k<=5;k++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        //Q6
        if(1+1==2){
            System.out.println("true");
        }
        for(int i=0;i<1;i--);
    }
}
