
public class Pattern {
    public static void main(String args[]){
        int n=4;
        System.out.println("Half Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)           //Half Pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        System.out.println(" Inverted Half Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)           
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Left  half pyramid
         System.out.println(" Left Half Pyramid");
        for(int r=1;r<=4;r++){
            //space
            for(int c=1;c<=(n-r);c++){
                System.out.print(" ");
            }
            //star
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Pyramid
        System.out.println(" Pyramid");

        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=9;j++){
                if(j>=(6-i) && j<=(4+i)){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
        //Diamond
        int n2=5;
         for(int i=1;i<=n2;i++){
            //star
            for(int j=9;j<=1;j++){
                if(j>=(6-i) && j<=(4+i)){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
        //Pyramid (Not Good)
        // System.out.println(" Pyramid");
        // for(int r=1;r<=n;r++){
        //     //space
        //     for(int c=1;c<=(n-r);c++){
        //         System.out.print(" ");
        //     }
        //     //star
        //     for(int c=1;c<=r;c++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        //1234
        System.out.println(" 1234");
        int val=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val++);
            }
            System.out.println();
        }
        //ABCDEFGHIJ
        System.out.println(" ABCDEFGHIJ");
        char ch='A';
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

        
    }
}
